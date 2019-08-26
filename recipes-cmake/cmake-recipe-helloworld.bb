SUMMARY = "Simple Hello World Cmake application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# Source location
SRCREV = "${AUTOREV}"
SRC_URI = "git://git@github.com/ptrkfry/edays_cmake_example.git;protocol=ssh;branch=master"

# Directory to which the source code is dowloaded
S = "${WORKDIR}/git"

# Include cmake class to automatically build and install CMake projct
inherit cmake

# Reset EXTRA_OECMAKE to nothing
EXTRA_OECMAKE = ""
