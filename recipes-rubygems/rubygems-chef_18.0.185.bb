# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef"
DESCRIPTION = "A systems integration framework, built to bring the benefits of configuration management to your entire infrastructure."
HOMEPAGE = "https://www.chef.io"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-aws-sdk-s3-native \
    rubygems-aws-sdk-secretsmanager-native \
    rubygems-chef-config-native \
    rubygems-chef-utils-native \
    rubygems-chef-vault-native \
    rubygems-chef-zero-native \
    rubygems-corefoundation-native \
    rubygems-diff-lcs-native \
    rubygems-erubis-native \
    rubygems-ffi-libarchive-native \
    rubygems-ffi-native \
    rubygems-ffi-yajl-native \
    rubygems-iniparse-native \
    rubygems-inspec-core-native \
    rubygems-license-acceptance-native \
    rubygems-mixlib-archive-native \
    rubygems-mixlib-authentication-native \
    rubygems-mixlib-cli-native \
    rubygems-mixlib-log-native \
    rubygems-mixlib-shellout-native \
    rubygems-net-ftp-native \
    rubygems-net-sftp-native \
    rubygems-ohai-native \
    rubygems-plist-native \
    rubygems-proxifier-native \
    rubygems-syslog-logger-native \
    rubygems-train-core-native \
    rubygems-train-rest-native \
    rubygems-train-winrm-native \
    rubygems-unf-ext-native \
    rubygems-uuidtools-native \
    rubygems-vault-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d46257ffea0f07253e8eabd2b1d0fac9"
SRC_URI[sha256sum] = "46ea79f043091d1dd40c44343b6ea5b5851c6eb5c70b57c68556f0e21b8751d3"

GEM_NAME = "chef"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_generate_spec:append() {
    # remove the rc2 suffix
    sed -i 's#1.1.0.rc2#1.1.0#g' ${GEM_SPEC_FILE}
}

do_install:append() {
    rm -f ${GEM_HOME}/gems/chef-${PV}/spec/functional/assets/chefinittest
}

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-aws-sdk-s3 \
    rubygems-aws-sdk-secretsmanager \
    rubygems-chef-config \
    rubygems-chef-utils \
    rubygems-chef-vault \
    rubygems-chef-zero \
    rubygems-corefoundation \
    rubygems-diff-lcs \
    rubygems-erubis \
    rubygems-ffi \
    rubygems-ffi-libarchive \
    rubygems-ffi-yajl \
    rubygems-iniparse \
    rubygems-inspec-core \
    rubygems-license-acceptance \
    rubygems-mixlib-archive \
    rubygems-mixlib-authentication \
    rubygems-mixlib-cli \
    rubygems-mixlib-log \
    rubygems-mixlib-shellout \
    rubygems-net-ftp \
    rubygems-net-sftp \
    rubygems-ohai \
    rubygems-plist \
    rubygems-proxifier \
    rubygems-syslog-logger \
    rubygems-train-core \
    rubygems-train-rest \
    rubygems-train-winrm \
    rubygems-unf-ext \
    rubygems-uuidtools \
    rubygems-vault \
"

BBCLASSEXTEND = "native"