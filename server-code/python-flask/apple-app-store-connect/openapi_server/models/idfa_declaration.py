from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_store_version_submission_relationships import AppStoreVersionSubmissionRelationships
from openapi_server.models.idfa_declaration_attributes import IdfaDeclarationAttributes
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.app_store_version_submission_relationships import AppStoreVersionSubmissionRelationships  # noqa: E501
from openapi_server.models.idfa_declaration_attributes import IdfaDeclarationAttributes  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class IdfaDeclaration(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """IdfaDeclaration - a model defined in OpenAPI

        :param attributes: The attributes of this IdfaDeclaration.  # noqa: E501
        :type attributes: IdfaDeclarationAttributes
        :param id: The id of this IdfaDeclaration.  # noqa: E501
        :type id: str
        :param links: The links of this IdfaDeclaration.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this IdfaDeclaration.  # noqa: E501
        :type relationships: AppStoreVersionSubmissionRelationships
        :param type: The type of this IdfaDeclaration.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': IdfaDeclarationAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': AppStoreVersionSubmissionRelationships,
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
    def from_dict(cls, dikt) -> 'IdfaDeclaration':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IdfaDeclaration of this IdfaDeclaration.  # noqa: E501
        :rtype: IdfaDeclaration
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> IdfaDeclarationAttributes:
        """Gets the attributes of this IdfaDeclaration.


        :return: The attributes of this IdfaDeclaration.
        :rtype: IdfaDeclarationAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: IdfaDeclarationAttributes):
        """Sets the attributes of this IdfaDeclaration.


        :param attributes: The attributes of this IdfaDeclaration.
        :type attributes: IdfaDeclarationAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this IdfaDeclaration.


        :return: The id of this IdfaDeclaration.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IdfaDeclaration.


        :param id: The id of this IdfaDeclaration.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this IdfaDeclaration.


        :return: The links of this IdfaDeclaration.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this IdfaDeclaration.


        :param links: The links of this IdfaDeclaration.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> AppStoreVersionSubmissionRelationships:
        """Gets the relationships of this IdfaDeclaration.


        :return: The relationships of this IdfaDeclaration.
        :rtype: AppStoreVersionSubmissionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppStoreVersionSubmissionRelationships):
        """Sets the relationships of this IdfaDeclaration.


        :param relationships: The relationships of this IdfaDeclaration.
        :type relationships: AppStoreVersionSubmissionRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this IdfaDeclaration.


        :return: The type of this IdfaDeclaration.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this IdfaDeclaration.


        :param type: The type of this IdfaDeclaration.
        :type type: str
        """
        allowed_values = ["idfaDeclarations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
