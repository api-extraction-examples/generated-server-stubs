from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_license_agreement_attributes import BetaLicenseAgreementAttributes
from openapi_server.models.end_user_license_agreement_relationships import EndUserLicenseAgreementRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.beta_license_agreement_attributes import BetaLicenseAgreementAttributes  # noqa: E501
from openapi_server.models.end_user_license_agreement_relationships import EndUserLicenseAgreementRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class EndUserLicenseAgreement(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """EndUserLicenseAgreement - a model defined in OpenAPI

        :param attributes: The attributes of this EndUserLicenseAgreement.  # noqa: E501
        :type attributes: BetaLicenseAgreementAttributes
        :param id: The id of this EndUserLicenseAgreement.  # noqa: E501
        :type id: str
        :param links: The links of this EndUserLicenseAgreement.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this EndUserLicenseAgreement.  # noqa: E501
        :type relationships: EndUserLicenseAgreementRelationships
        :param type: The type of this EndUserLicenseAgreement.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BetaLicenseAgreementAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': EndUserLicenseAgreementRelationships,
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
    def from_dict(cls, dikt) -> 'EndUserLicenseAgreement':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EndUserLicenseAgreement of this EndUserLicenseAgreement.  # noqa: E501
        :rtype: EndUserLicenseAgreement
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BetaLicenseAgreementAttributes:
        """Gets the attributes of this EndUserLicenseAgreement.


        :return: The attributes of this EndUserLicenseAgreement.
        :rtype: BetaLicenseAgreementAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BetaLicenseAgreementAttributes):
        """Sets the attributes of this EndUserLicenseAgreement.


        :param attributes: The attributes of this EndUserLicenseAgreement.
        :type attributes: BetaLicenseAgreementAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this EndUserLicenseAgreement.


        :return: The id of this EndUserLicenseAgreement.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this EndUserLicenseAgreement.


        :param id: The id of this EndUserLicenseAgreement.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this EndUserLicenseAgreement.


        :return: The links of this EndUserLicenseAgreement.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this EndUserLicenseAgreement.


        :param links: The links of this EndUserLicenseAgreement.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> EndUserLicenseAgreementRelationships:
        """Gets the relationships of this EndUserLicenseAgreement.


        :return: The relationships of this EndUserLicenseAgreement.
        :rtype: EndUserLicenseAgreementRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: EndUserLicenseAgreementRelationships):
        """Sets the relationships of this EndUserLicenseAgreement.


        :param relationships: The relationships of this EndUserLicenseAgreement.
        :type relationships: EndUserLicenseAgreementRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this EndUserLicenseAgreement.


        :return: The type of this EndUserLicenseAgreement.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this EndUserLicenseAgreement.


        :param type: The type of this EndUserLicenseAgreement.
        :type type: str
        """
        allowed_values = ["endUserLicenseAgreements"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
