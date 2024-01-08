from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_attributes import AppStoreVersionAttributes
from openapi_server.models.app_store_version_relationships import AppStoreVersionRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app_store_version_attributes import AppStoreVersionAttributes  # noqa: E501
from openapi_server.models.app_store_version_relationships import AppStoreVersionRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class AppStoreVersion(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """AppStoreVersion - a model defined in OpenAPI

        :param attributes: The attributes of this AppStoreVersion.  # noqa: E501
        :type attributes: AppStoreVersionAttributes
        :param id: The id of this AppStoreVersion.  # noqa: E501
        :type id: str
        :param links: The links of this AppStoreVersion.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this AppStoreVersion.  # noqa: E501
        :type relationships: AppStoreVersionRelationships
        :param type: The type of this AppStoreVersion.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppStoreVersionAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': AppStoreVersionRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'links': 'links',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._links = links
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersion':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersion of this AppStoreVersion.  # noqa: E501
        :rtype: AppStoreVersion
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppStoreVersionAttributes:
        """Gets the attributes of this AppStoreVersion.


        :return: The attributes of this AppStoreVersion.
        :rtype: AppStoreVersionAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppStoreVersionAttributes):
        """Sets the attributes of this AppStoreVersion.


        :param attributes: The attributes of this AppStoreVersion.
        :type attributes: AppStoreVersionAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this AppStoreVersion.


        :return: The id of this AppStoreVersion.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppStoreVersion.


        :param id: The id of this AppStoreVersion.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this AppStoreVersion.


        :return: The links of this AppStoreVersion.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this AppStoreVersion.


        :param links: The links of this AppStoreVersion.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppStoreVersionRelationships:
        """Gets the relationships of this AppStoreVersion.


        :return: The relationships of this AppStoreVersion.
        :rtype: AppStoreVersionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppStoreVersionRelationships):
        """Sets the relationships of this AppStoreVersion.


        :param relationships: The relationships of this AppStoreVersion.
        :type relationships: AppStoreVersionRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppStoreVersion.


        :return: The type of this AppStoreVersion.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppStoreVersion.


        :param type: The type of this AppStoreVersion.
        :type type: str
        """
        allowed_values = ["appStoreVersions"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type