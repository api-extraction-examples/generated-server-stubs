from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class VersionInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, git_version=None, version=None):  # noqa: E501
        """VersionInfo - a model defined in OpenAPI

        :param git_version: The git_version of this VersionInfo.  # noqa: E501
        :type git_version: str
        :param version: The version of this VersionInfo.  # noqa: E501
        :type version: str
        """
        self.openapi_types = {
            'git_version': str,
            'version': str
        }

        self.attribute_map = {
            'git_version': 'git_version',
            'version': 'version'
        }

        self._git_version = git_version
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'VersionInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VersionInfo of this VersionInfo.  # noqa: E501
        :rtype: VersionInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def git_version(self) -> str:
        """Gets the git_version of this VersionInfo.

        The git version (including git commit hash)  # noqa: E501

        :return: The git_version of this VersionInfo.
        :rtype: str
        """
        return self._git_version

    @git_version.setter
    def git_version(self, git_version: str):
        """Sets the git_version of this VersionInfo.

        The git version (including git commit hash)  # noqa: E501

        :param git_version: The git_version of this VersionInfo.
        :type git_version: str
        """

        self._git_version = git_version

    @property
    def version(self) -> str:
        """Gets the version of this VersionInfo.

        The version of Airflow  # noqa: E501

        :return: The version of this VersionInfo.
        :rtype: str
        """
        return self._version

    @version.setter
    def version(self, version: str):
        """Sets the version of this VersionInfo.

        The version of Airflow  # noqa: E501

        :param version: The version of this VersionInfo.
        :type version: str
        """

        self._version = version
