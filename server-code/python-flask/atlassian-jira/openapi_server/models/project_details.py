from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_avatar_urls import ProjectAvatarUrls
from openapi_server.models.project_details_project_category import ProjectDetailsProjectCategory
from openapi_server import util

from openapi_server.models.project_avatar_urls import ProjectAvatarUrls  # noqa: E501
from openapi_server.models.project_details_project_category import ProjectDetailsProjectCategory  # noqa: E501

class ProjectDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, avatar_urls=None, id=None, key=None, name=None, project_category=None, project_type_key=None, _self=None, simplified=None):  # noqa: E501
        """ProjectDetails - a model defined in OpenAPI

        :param avatar_urls: The avatar_urls of this ProjectDetails.  # noqa: E501
        :type avatar_urls: ProjectAvatarUrls
        :param id: The id of this ProjectDetails.  # noqa: E501
        :type id: str
        :param key: The key of this ProjectDetails.  # noqa: E501
        :type key: str
        :param name: The name of this ProjectDetails.  # noqa: E501
        :type name: str
        :param project_category: The project_category of this ProjectDetails.  # noqa: E501
        :type project_category: ProjectDetailsProjectCategory
        :param project_type_key: The project_type_key of this ProjectDetails.  # noqa: E501
        :type project_type_key: str
        :param _self: The _self of this ProjectDetails.  # noqa: E501
        :type _self: str
        :param simplified: The simplified of this ProjectDetails.  # noqa: E501
        :type simplified: bool
        """
        self.openapi_types = {
            'avatar_urls': ProjectAvatarUrls,
            'id': str,
            'key': str,
            'name': str,
            'project_category': ProjectDetailsProjectCategory,
            'project_type_key': str,
            '_self': str,
            'simplified': bool
        }

        self.attribute_map = {
            'avatar_urls': 'avatarUrls',
            'id': 'id',
            'key': 'key',
            'name': 'name',
            'project_category': 'projectCategory',
            'project_type_key': 'projectTypeKey',
            '_self': 'self',
            'simplified': 'simplified'
        }

        self._avatar_urls = avatar_urls
        self._id = id
        self._key = key
        self._name = name
        self._project_category = project_category
        self._project_type_key = project_type_key
        self.__self = _self
        self._simplified = simplified

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectDetails of this ProjectDetails.  # noqa: E501
        :rtype: ProjectDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def avatar_urls(self) -> ProjectAvatarUrls:
        """Gets the avatar_urls of this ProjectDetails.


        :return: The avatar_urls of this ProjectDetails.
        :rtype: ProjectAvatarUrls
        """
        return self._avatar_urls

    @avatar_urls.setter
    def avatar_urls(self, avatar_urls: ProjectAvatarUrls):
        """Sets the avatar_urls of this ProjectDetails.


        :param avatar_urls: The avatar_urls of this ProjectDetails.
        :type avatar_urls: ProjectAvatarUrls
        """

        self._avatar_urls = avatar_urls

    @property
    def id(self) -> str:
        """Gets the id of this ProjectDetails.

        The ID of the project.  # noqa: E501

        :return: The id of this ProjectDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ProjectDetails.

        The ID of the project.  # noqa: E501

        :param id: The id of this ProjectDetails.
        :type id: str
        """

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this ProjectDetails.

        The key of the project.  # noqa: E501

        :return: The key of this ProjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this ProjectDetails.

        The key of the project.  # noqa: E501

        :param key: The key of this ProjectDetails.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this ProjectDetails.

        The name of the project.  # noqa: E501

        :return: The name of this ProjectDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectDetails.

        The name of the project.  # noqa: E501

        :param name: The name of this ProjectDetails.
        :type name: str
        """

        self._name = name

    @property
    def project_category(self) -> ProjectDetailsProjectCategory:
        """Gets the project_category of this ProjectDetails.


        :return: The project_category of this ProjectDetails.
        :rtype: ProjectDetailsProjectCategory
        """
        return self._project_category

    @project_category.setter
    def project_category(self, project_category: ProjectDetailsProjectCategory):
        """Sets the project_category of this ProjectDetails.


        :param project_category: The project_category of this ProjectDetails.
        :type project_category: ProjectDetailsProjectCategory
        """

        self._project_category = project_category

    @property
    def project_type_key(self) -> str:
        """Gets the project_type_key of this ProjectDetails.

        The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.  # noqa: E501

        :return: The project_type_key of this ProjectDetails.
        :rtype: str
        """
        return self._project_type_key

    @project_type_key.setter
    def project_type_key(self, project_type_key: str):
        """Sets the project_type_key of this ProjectDetails.

        The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.  # noqa: E501

        :param project_type_key: The project_type_key of this ProjectDetails.
        :type project_type_key: str
        """
        allowed_values = ["software", "service_desk", "business"]  # noqa: E501
        if project_type_key not in allowed_values:
            raise ValueError(
                "Invalid value for `project_type_key` ({0}), must be one of {1}"
                .format(project_type_key, allowed_values)
            )

        self._project_type_key = project_type_key

    @property
    def _self(self) -> str:
        """Gets the _self of this ProjectDetails.

        The URL of the project details.  # noqa: E501

        :return: The _self of this ProjectDetails.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this ProjectDetails.

        The URL of the project details.  # noqa: E501

        :param _self: The _self of this ProjectDetails.
        :type _self: str
        """

        self.__self = _self

    @property
    def simplified(self) -> bool:
        """Gets the simplified of this ProjectDetails.

        Whether or not the project is simplified.  # noqa: E501

        :return: The simplified of this ProjectDetails.
        :rtype: bool
        """
        return self._simplified

    @simplified.setter
    def simplified(self, simplified: bool):
        """Sets the simplified of this ProjectDetails.

        Whether or not the project is simplified.  # noqa: E501

        :param simplified: The simplified of this ProjectDetails.
        :type simplified: bool
        """

        self._simplified = simplified