from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_category_attributes import AppCategoryAttributes
from openapi_server.models.app_category_relationships import AppCategoryRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app_category_attributes import AppCategoryAttributes  # noqa: E501
from openapi_server.models.app_category_relationships import AppCategoryRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class AppCategory(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """AppCategory - a model defined in OpenAPI

        :param attributes: The attributes of this AppCategory.  # noqa: E501
        :type attributes: AppCategoryAttributes
        :param id: The id of this AppCategory.  # noqa: E501
        :type id: str
        :param links: The links of this AppCategory.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this AppCategory.  # noqa: E501
        :type relationships: AppCategoryRelationships
        :param type: The type of this AppCategory.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppCategoryAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': AppCategoryRelationships,
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
    def from_dict(cls, dikt) -> 'AppCategory':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppCategory of this AppCategory.  # noqa: E501
        :rtype: AppCategory
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppCategoryAttributes:
        """Gets the attributes of this AppCategory.


        :return: The attributes of this AppCategory.
        :rtype: AppCategoryAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppCategoryAttributes):
        """Sets the attributes of this AppCategory.


        :param attributes: The attributes of this AppCategory.
        :type attributes: AppCategoryAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this AppCategory.


        :return: The id of this AppCategory.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppCategory.


        :param id: The id of this AppCategory.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this AppCategory.


        :return: The links of this AppCategory.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this AppCategory.


        :param links: The links of this AppCategory.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppCategoryRelationships:
        """Gets the relationships of this AppCategory.


        :return: The relationships of this AppCategory.
        :rtype: AppCategoryRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppCategoryRelationships):
        """Sets the relationships of this AppCategory.


        :param relationships: The relationships of this AppCategory.
        :type relationships: AppCategoryRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppCategory.


        :return: The type of this AppCategory.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppCategory.


        :param type: The type of this AppCategory.
        :type type: str
        """
        allowed_values = ["appCategories"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
