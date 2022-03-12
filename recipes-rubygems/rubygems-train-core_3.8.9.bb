# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-core"
DESCRIPTION = "A minimal Train with a backends for ssh and winrm."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-ffi-native \
    rubygems-json-native \
    rubygems-mixlib-shellout-native \
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1d217aed2f1e3549516e66bc302d7b4b"
SRC_URI[sha256sum] = "e5a364efb4440fd84c401aede90828e910dbfb6486438e093f5828bd5e2ee64a"

GEM_NAME = "train-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-ffi \
    rubygems-json \
    rubygems-mixlib-shellout \
    rubygems-net-scp \
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"