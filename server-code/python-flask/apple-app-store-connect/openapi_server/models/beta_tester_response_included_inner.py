from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app import App
from openapi_server.models.beta_group import BetaGroup
from openapi_server.models.build import Build
from openapi_server.models.build_attributes import BuildAttributes
from openapi_server.models.build_relationships import BuildRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app import App  # noqa: E501
from openapi_server.models.beta_group import BetaGroup  # noqa: E501
from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.build_attributes import BuildAttributes  # noqa: E501
from openapi_server.models.build_relationships import BuildRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class BetaTesterResponseIncludedInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """BetaTesterResponseIncludedInner - a model defined in OpenAPI

        :param attributes: The attributes of this BetaTesterResponseIncludedInner.  # noqa: E501
        :type attributes: BuildAttributes
        :param id: The id of this BetaTesterResponseIncludedInner.  # noqa: E501
        :type id: str
        :param links: The links of this BetaTesterResponseIncludedInner.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this BetaTesterResponseIncludedInner.  # noqa: E501
        :type relationships: BuildRelationships
        :param type: The type of this BetaTesterResponseIncludedInner.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BuildAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': BuildRelationships,
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
    def from_dict(cls, dikt) -> 'BetaTesterResponseIncludedInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaTesterResponse_included_inner of this BetaTesterResponseIncludedInner.  # noqa: E501
        :rtype: BetaTesterResponseIncludedInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BuildAttributes:
        """Gets the attributes of this BetaTesterResponseIncludedInner.


        :return: The attributes of this BetaTesterResponseIncludedInner.
        :rtype: BuildAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BuildAttributes):
        """Sets the attributes of this BetaTesterResponseIncludedInner.


        :param attributes: The attributes of this BetaTesterResponseIncludedInner.
        :type attributes: BuildAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BetaTesterResponseIncludedInner.


        :return: The id of this BetaTesterResponseIncludedInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BetaTesterResponseIncludedInner.


        :param id: The id of this BetaTesterResponseIncludedInner.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this BetaTesterResponseIncludedInner.


        :return: The links of this BetaTesterResponseIncludedInner.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this BetaTesterResponseIncludedInner.


        :param links: The links of this BetaTesterResponseIncludedInner.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> BuildRelationships:
        """Gets the relationships of this BetaTesterResponseIncludedInner.


        :return: The relationships of this BetaTesterResponseIncludedInner.
        :rtype: BuildRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: BuildRelationships):
        """Sets the relationships of this BetaTesterResponseIncludedInner.


        :param relationships: The relationships of this BetaTesterResponseIncludedInner.
        :type relationships: BuildRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BetaTesterResponseIncludedInner.


        :return: The type of this BetaTesterResponseIncludedInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaTesterResponseIncludedInner.


        :param type: The type of this BetaTesterResponseIncludedInner.
        :type type: str
        """
        allowed_values = ["apps", "betaGroups", "builds"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type