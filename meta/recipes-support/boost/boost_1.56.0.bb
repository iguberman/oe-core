include boost-${PV}.inc
include boost.inc

SRC_URI += "\
    file://arm-intrinsics.patch \
    file://0001-Added-support-for-extending-operations-to-GCC-atomic.patch;striplevel=2 \
    file://boost-CVE-2012-2677.patch \
"
