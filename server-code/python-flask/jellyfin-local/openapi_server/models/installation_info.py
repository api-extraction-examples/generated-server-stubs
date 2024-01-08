from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.version import Version
from openapi_server import util

from openapi_server.models.version import Version  # noqa: E501

class InstallationInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, changelog=None, checksum=None, guid=None, name=None, source_url=None, version=None):  # noqa: E501
        """InstallationInfo - a model defined in OpenAPI

        :param changelog: The changelog of this InstallationInfo.  # noqa: E501
        :type changelog: str
        :param checksum: The checksum of this InstallationInfo.  # noqa: E501
        :type checksum: str
        :param guid: The guid of this InstallationInfo.  # noqa: E501
        :type guid: str
        :param name: The name of this InstallationInfo.  # noqa: E501
        :type name: str
        :param source_url: The source_url of this InstallationInfo.  # noqa: E501
        :type source_url: str
        :param version: The version of this InstallationInfo.  # noqa: E501
        :type version: Version
        """
        self.openapi_types = {
            'changelog': str,
            'checksum': str,
            'guid': str,
            'name': str,
            'source_url': str,
            'version': Version
        }

        self.attribute_map = {
            'changelog': 'Changelog',
            'checksum': 'Checksum',
            'guid': 'Guid',
            'name': 'Name',
            'source_url': 'SourceUrl',
            'version': 'Version'
        }

        self._changelog = changelog
        self._checksum = checksum
        self._guid = guid
        self._name = name
        self._source_url = source_url
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'InstallationInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InstallationInfo of this InstallationInfo.  # noqa: E501
        :rtype: InstallationInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def changelog(self) -> str:
        """Gets the changelog of this InstallationInfo.

        Gets or sets the changelog for this version.  # noqa: E501

        :return: The changelog of this InstallationInfo.
        :rtype: str
        """
        return self._changelog

    @changelog.setter
    def changelog(self, changelog: str):
        """Sets the changelog of this InstallationInfo.

        Gets or sets the changelog for this version.  # noqa: E501

        :param changelog: The changelog of this InstallationInfo.
        :type changelog: str
        """

        self._changelog = changelog

    @property
    def checksum(self) -> str:
        """Gets the checksum of this InstallationInfo.

        Gets or sets a checksum for the binary.  # noqa: E501

        :return: The checksum of this InstallationInfo.
        :rtype: str
        """
        return self._checksum

    @checksum.setter
    def checksum(self, checksum: str):
        """Sets the checksum of this InstallationInfo.

        Gets or sets a checksum for the binary.  # noqa: E501

        :param checksum: The checksum of this InstallationInfo.
        :type checksum: str
        """

        self._checksum = checksum

    @property
    def guid(self) -> str:
        """Gets the guid of this InstallationInfo.

        Gets or sets the Id.  # noqa: E501

        :return: The guid of this InstallationInfo.
        :rtype: str
        """
        return self._guid

    @guid.setter
    def guid(self, guid: str):
        """Sets the guid of this InstallationInfo.

        Gets or sets the Id.  # noqa: E501

        :param guid: The guid of this InstallationInfo.
        :type guid: str
        """

        self._guid = guid

    @property
    def name(self) -> str:
        """Gets the name of this InstallationInfo.

        Gets or sets the name.  # noqa: E501

        :return: The name of this InstallationInfo.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this InstallationInfo.

        Gets or sets the name.  # noqa: E501

        :param name: The name of this InstallationInfo.
        :type name: str
        """

        self._name = name

    @property
    def source_url(self) -> str:
        """Gets the source_url of this InstallationInfo.

        Gets or sets the source URL.  # noqa: E501

        :return: The source_url of this InstallationInfo.
        :rtype: str
        """
        return self._source_url

    @source_url.setter
    def source_url(self, source_url: str):
        """Sets the source_url of this InstallationInfo.

        Gets or sets the source URL.  # noqa: E501

        :param source_url: The source_url of this InstallationInfo.
        :type source_url: str
        """

        self._source_url = source_url

    @property
    def version(self) -> Version:
        """Gets the version of this InstallationInfo.


        :return: The version of this InstallationInfo.
        :rtype: Version
        """
        return self._version

    @version.setter
    def version(self, version: Version):
        """Sets the version of this InstallationInfo.


        :param version: The version of this InstallationInfo.
        :type version: Version
        """

        self._version = version
