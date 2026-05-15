#!/bin/bash

set -e

echo "=== Step 1: Removing old Docker packages ==="
sudo dnf remove -y docker \
                   docker-client \
                   docker-client-latest \
                   docker-common \
                   docker-latest \
                   docker-latest-logrotate \
                   docker-logrotate \
                   docker-engine \
                   podman \
                   runc

echo "=== Step 2: Installing dnf-plugins-core ==="
sudo dnf -y install dnf-plugins-core

echo "=== Step 3: Adding Docker repository ==="
sudo dnf config-manager --add-repo https://download.docker.com/linux/rhel/docker-ce.repo

echo "=== Step 4: Installing Docker ==="
sudo dnf install -y docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

echo "=== Step 5: Enabling and starting Docker ==="
sudo systemctl enable --now docker


echo "=== Step 5: Enabling and starting Docker ==="
sudo usermod -aG docker ec2-user

echo "=== Docker installation complete! ==="
docker --version

