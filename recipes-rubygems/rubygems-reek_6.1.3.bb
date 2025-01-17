# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: reek"
DESCRIPTION = "Reek is a tool that examines Ruby classes, modules and methods and reports any code smells it finds."
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

EXTRA_DEPENDS:append = " \
    rubygems-codeclimate-engine-rb \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-kwalify-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a61f0506b6b41cfef93a7a5d557c7c8e"
SRC_URI[sha256sum] = "d1a136599336c976911cd40adaedcc56fc1fb91a4584bc88cb520455410ea80d"

GEM_NAME = "reek"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-kwalify \
    rubygems-parser \
    rubygems-rainbow \
"

BBCLASSEXTEND = "native"
