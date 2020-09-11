#! /bin/sh
export PATH=/bin
echo Starting Pine Linux
echo Staring mdev
echo /sbin/mdev > /proc/sys/kernel/hotplug
mdev -sh
echo Setting host name
hostname $(cat /etc/hostname)
ifconfig lo up
echo setting swap 
swapon -a
echo mounting fstab content
mount -a
