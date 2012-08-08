DESCRIPTION = "Revised OpenFlow Library Core Libraries (ROFL)"
SECTION = "net"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=5d425c8f3157dbf212db2ec53d9e5132"

DEPENDS = "libcli"

SRCREV="AUTOINC"
PR = "r0"

SRC_URI = "git://gitolite@codebasin.net/rofl-pub.git;protocol=ssh \
	   file://add_autotools_support.patch;apply=yes"

S = "${WORKDIR}/git"

inherit autotools
