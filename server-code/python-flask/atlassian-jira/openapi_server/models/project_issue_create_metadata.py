from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.issue_type_issue_create_metadata import IssueTypeIssueCreateMetadata
from openapi_server.models.project_issue_create_metadata_avatar_urls import ProjectIssueCreateMetadataAvatarUrls
from openapi_server import util

from openapi_server.models.issue_type_issue_create_metadata import IssueTypeIssueCreateMetadata  # noqa: E501
from openapi_server.models.project_issue_create_metadata_avatar_urls import ProjectIssueCreateMetadataAvatarUrls  # noqa: E501

class ProjectIssueCreateMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, avatar_urls=None, expand=None, id=None, issuetypes=None, key=None, name=None, _self=None):  # noqa: E501
        """ProjectIssueCreateMetadata - a model defined in OpenAPI

        :param avatar_urls: The avatar_urls of this ProjectIssueCreateMetadata.  # noqa: E501
        :type avatar_urls: ProjectIssueCreateMetadataAvatarUrls
        :param expand: The expand of this ProjectIssueCreateMetadata.  # noqa: E501
        :type expand: str
        :param id: The id of this ProjectIssueCreateMetadata.  # noqa: E501
        :type id: str
        :param issuetypes: The issuetypes of this ProjectIssueCreateMetadata.  # noqa: E501
        :type issuetypes: List[IssueTypeIssueCreateMetadata]
        :param key: The key of this ProjectIssueCreateMetadata.  # noqa: E501
        :type key: str
        :param name: The name of this ProjectIssueCreateMetadata.  # noqa: E501
        :type name: str
        :param _self: The _self of this ProjectIssueCreateMetadata.  # noqa: E501
        :type _self: str
        """
        self.openapi_types = {
            'avatar_urls': ProjectIssueCreateMetadataAvatarUrls,
            'expand': str,
            'id': str,
            'issuetypes': List[IssueTypeIssueCreateMetadata],
            'key': str,
            'name': str,
            '_self': str
        }

        self.attribute_map = {
            'avatar_urls': 'avatarUrls',
            'expand': 'expand',
            'id': 'id',
            'issuetypes': 'issuetypes',
            'key': 'key',
            'name': 'name',
            '_self': 'self'
        }

        self._avatar_urls = avatar_urls
        self._expand = expand
        self._id = id
        self._issuetypes = issuetypes
        self._key = key
        self._name = name
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectIssueCreateMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectIssueCreateMetadata of this ProjectIssueCreateMetadata.  # noqa: E501
        :rtype: ProjectIssueCreateMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def avatar_urls(self) -> ProjectIssueCreateMetadataAvatarUrls:
        """Gets the avatar_urls of this ProjectIssueCreateMetadata.


        :return: The avatar_urls of this ProjectIssueCreateMetadata.
        :rtype: ProjectIssueCreateMetadataAvatarUrls
        """
        return self._avatar_urls

    @avatar_urls.setter
    def avatar_urls(self, avatar_urls: ProjectIssueCreateMetadataAvatarUrls):
        """Sets the avatar_urls of this ProjectIssueCreateMetadata.


        :param avatar_urls: The avatar_urls of this ProjectIssueCreateMetadata.
        :type avatar_urls: ProjectIssueCreateMetadataAvatarUrls
        """

        self._avatar_urls = avatar_urls

    @property
    def expand(self) -> str:
        """Gets the expand of this ProjectIssueCreateMetadata.

        Expand options that include additional project issue create metadata details in the response.  # noqa: E501

        :return: The expand of this ProjectIssueCreateMetadata.
        :rtype: str
        """
        return self._expand

    @expand.setter
    def expand(self, expand: str):
        """Sets the expand of this ProjectIssueCreateMetadata.

        Expand options that include additional project issue create metadata details in the response.  # noqa: E501

        :param expand: The expand of this ProjectIssueCreateMetadata.
        :type expand: str
        """

        self._expand = expand

    @property
    def id(self) -> str:
        """Gets the id of this ProjectIssueCreateMetadata.

        The ID of the project.  # noqa: E501

        :return: The id of this ProjectIssueCreateMetadata.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ProjectIssueCreateMetadata.

        The ID of the project.  # noqa: E501

        :param id: The id of this ProjectIssueCreateMetadata.
        :type id: str
        """

        self._id = id

    @property
    def issuetypes(self) -> List[IssueTypeIssueCreateMetadata]:
        """Gets the issuetypes of this ProjectIssueCreateMetadata.

        List of the issue types supported by the project.  # noqa: E501

        :return: The issuetypes of this ProjectIssueCreateMetadata.
        :rtype: List[IssueTypeIssueCreateMetadata]
        """
        return self._issuetypes

    @issuetypes.setter
    def issuetypes(self, issuetypes: List[IssueTypeIssueCreateMetadata]):
        """Sets the issuetypes of this ProjectIssueCreateMetadata.

        List of the issue types supported by the project.  # noqa: E501

        :param issuetypes: The issuetypes of this ProjectIssueCreateMetadata.
        :type issuetypes: List[IssueTypeIssueCreateMetadata]
        """

        self._issuetypes = issuetypes

    @property
    def key(self) -> str:
        """Gets the key of this ProjectIssueCreateMetadata.

        The key of the project.  # noqa: E501

        :return: The key of this ProjectIssueCreateMetadata.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this ProjectIssueCreateMetadata.

        The key of the project.  # noqa: E501

        :param key: The key of this ProjectIssueCreateMetadata.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this ProjectIssueCreateMetadata.

        The name of the project.  # noqa: E501

        :return: The name of this ProjectIssueCreateMetadata.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectIssueCreateMetadata.

        The name of the project.  # noqa: E501

        :param name: The name of this ProjectIssueCreateMetadata.
        :type name: str
        """

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this ProjectIssueCreateMetadata.

        The URL of the project.  # noqa: E501

        :return: The _self of this ProjectIssueCreateMetadata.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this ProjectIssueCreateMetadata.

        The URL of the project.  # noqa: E501

        :param _self: The _self of this ProjectIssueCreateMetadata.
        :type _self: str
        """

        self.__self = _self