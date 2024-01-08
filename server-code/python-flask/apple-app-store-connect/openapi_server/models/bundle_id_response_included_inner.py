from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app import App
from openapi_server.models.app_attributes import AppAttributes
from openapi_server.models.app_relationships import AppRelationships
from openapi_server.models.bundle_id_capability import BundleIdCapability
from openapi_server.models.profile import Profile
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app import App  # noqa: E501
from openapi_server.models.app_attributes import AppAttributes  # noqa: E501
from openapi_server.models.app_relationships import AppRelationships  # noqa: E501
from openapi_server.models.bundle_id_capability import BundleIdCapability  # noqa: E501
from openapi_server.models.profile import Profile  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class BundleIdResponseIncludedInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """BundleIdResponseIncludedInner - a model defined in OpenAPI

        :param attributes: The attributes of this BundleIdResponseIncludedInner.  # noqa: E501
        :type attributes: AppAttributes
        :param id: The id of this BundleIdResponseIncludedInner.  # noqa: E501
        :type id: str
        :param links: The links of this BundleIdResponseIncludedInner.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this BundleIdResponseIncludedInner.  # noqa: E501
        :type relationships: AppRelationships
        :param type: The type of this BundleIdResponseIncludedInner.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'BundleIdResponseIncludedInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdResponse_included_inner of this BundleIdResponseIncludedInner.  # noqa: E501
        :rtype: BundleIdResponseIncludedInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppAttributes:
        """Gets the attributes of this BundleIdResponseIncludedInner.


        :return: The attributes of this BundleIdResponseIncludedInner.
        :rtype: AppAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppAttributes):
        """Sets the attributes of this BundleIdResponseIncludedInner.


        :param attributes: The attributes of this BundleIdResponseIncludedInner.
        :type attributes: AppAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BundleIdResponseIncludedInner.


        :return: The id of this BundleIdResponseIncludedInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BundleIdResponseIncludedInner.


        :param id: The id of this BundleIdResponseIncludedInner.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this BundleIdResponseIncludedInner.


        :return: The links of this BundleIdResponseIncludedInner.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this BundleIdResponseIncludedInner.


        :param links: The links of this BundleIdResponseIncludedInner.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppRelationships:
        """Gets the relationships of this BundleIdResponseIncludedInner.


        :return: The relationships of this BundleIdResponseIncludedInner.
        :rtype: AppRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppRelationships):
        """Sets the relationships of this BundleIdResponseIncludedInner.


        :param relationships: The relationships of this BundleIdResponseIncludedInner.
        :type relationships: AppRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BundleIdResponseIncludedInner.


        :return: The type of this BundleIdResponseIncludedInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BundleIdResponseIncludedInner.


        :param type: The type of this BundleIdResponseIncludedInner.
        :type type: str
        """
        allowed_values = ["profiles", "bundleIdCapabilities", "apps"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type