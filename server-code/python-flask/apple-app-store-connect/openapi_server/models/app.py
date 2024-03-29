from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_attributes import AppAttributes
from openapi_server.models.app_relationships import AppRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app_attributes import AppAttributes  # noqa: E501
from openapi_server.models.app_relationships import AppRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class App(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """App - a model defined in OpenAPI

        :param attributes: The attributes of this App.  # noqa: E501
        :type attributes: AppAttributes
        :param id: The id of this App.  # noqa: E501
        :type id: str
        :param links: The links of this App.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this App.  # noqa: E501
        :type relationships: AppRelationships
        :param type: The type of this App.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': AppRelationships,
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
    def from_dict(cls, dikt) -> 'App':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The App of this App.  # noqa: E501
        :rtype: App
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppAttributes:
        """Gets the attributes of this App.


        :return: The attributes of this App.
        :rtype: AppAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppAttributes):
        """Sets the attributes of this App.


        :param attributes: The attributes of this App.
        :type attributes: AppAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this App.


        :return: The id of this App.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this App.


        :param id: The id of this App.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this App.


        :return: The links of this App.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this App.


        :param links: The links of this App.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppRelationships:
        """Gets the relationships of this App.


        :return: The relationships of this App.
        :rtype: AppRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppRelationships):
        """Sets the relationships of this App.


        :param relationships: The relationships of this App.
        :type relationships: AppRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this App.


        :return: The type of this App.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this App.


        :param type: The type of this App.
        :type type: str
        """
        allowed_values = ["apps"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
