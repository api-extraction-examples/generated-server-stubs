from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_category import AppCategory
from openapi_server.models.app_category_attributes import AppCategoryAttributes
from openapi_server.models.app_category_relationships import AppCategoryRelationships
from openapi_server.models.app_info_localization import AppInfoLocalization
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app_category import AppCategory  # noqa: E501
from openapi_server.models.app_category_attributes import AppCategoryAttributes  # noqa: E501
from openapi_server.models.app_category_relationships import AppCategoryRelationships  # noqa: E501
from openapi_server.models.app_info_localization import AppInfoLocalization  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class AppInfoResponseIncludedInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """AppInfoResponseIncludedInner - a model defined in OpenAPI

        :param attributes: The attributes of this AppInfoResponseIncludedInner.  # noqa: E501
        :type attributes: AppCategoryAttributes
        :param id: The id of this AppInfoResponseIncludedInner.  # noqa: E501
        :type id: str
        :param links: The links of this AppInfoResponseIncludedInner.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this AppInfoResponseIncludedInner.  # noqa: E501
        :type relationships: AppCategoryRelationships
        :param type: The type of this AppInfoResponseIncludedInner.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'AppInfoResponseIncludedInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfoResponse_included_inner of this AppInfoResponseIncludedInner.  # noqa: E501
        :rtype: AppInfoResponseIncludedInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppCategoryAttributes:
        """Gets the attributes of this AppInfoResponseIncludedInner.


        :return: The attributes of this AppInfoResponseIncludedInner.
        :rtype: AppCategoryAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppCategoryAttributes):
        """Sets the attributes of this AppInfoResponseIncludedInner.


        :param attributes: The attributes of this AppInfoResponseIncludedInner.
        :type attributes: AppCategoryAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this AppInfoResponseIncludedInner.


        :return: The id of this AppInfoResponseIncludedInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this AppInfoResponseIncludedInner.


        :param id: The id of this AppInfoResponseIncludedInner.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this AppInfoResponseIncludedInner.


        :return: The links of this AppInfoResponseIncludedInner.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this AppInfoResponseIncludedInner.


        :param links: The links of this AppInfoResponseIncludedInner.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppCategoryRelationships:
        """Gets the relationships of this AppInfoResponseIncludedInner.


        :return: The relationships of this AppInfoResponseIncludedInner.
        :rtype: AppCategoryRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppCategoryRelationships):
        """Sets the relationships of this AppInfoResponseIncludedInner.


        :param relationships: The relationships of this AppInfoResponseIncludedInner.
        :type relationships: AppCategoryRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppInfoResponseIncludedInner.


        :return: The type of this AppInfoResponseIncludedInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppInfoResponseIncludedInner.


        :param type: The type of this AppInfoResponseIncludedInner.
        :type type: str
        """
        allowed_values = ["appInfoLocalizations", "appCategories"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
