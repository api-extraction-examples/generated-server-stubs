from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.diagnostic_signature_attributes import DiagnosticSignatureAttributes
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.diagnostic_signature_attributes import DiagnosticSignatureAttributes  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class DiagnosticSignature(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, type=None):  # noqa: E501
        """DiagnosticSignature - a model defined in OpenAPI

        :param attributes: The attributes of this DiagnosticSignature.  # noqa: E501
        :type attributes: DiagnosticSignatureAttributes
        :param id: The id of this DiagnosticSignature.  # noqa: E501
        :type id: str
        :param links: The links of this DiagnosticSignature.  # noqa: E501
        :type links: ResourceLinks
        :param type: The type of this DiagnosticSignature.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': DiagnosticSignatureAttributes,
            'id': str,
            'links': ResourceLinks,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'links': 'links',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._links = links
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'DiagnosticSignature':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DiagnosticSignature of this DiagnosticSignature.  # noqa: E501
        :rtype: DiagnosticSignature
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> DiagnosticSignatureAttributes:
        """Gets the attributes of this DiagnosticSignature.


        :return: The attributes of this DiagnosticSignature.
        :rtype: DiagnosticSignatureAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: DiagnosticSignatureAttributes):
        """Sets the attributes of this DiagnosticSignature.


        :param attributes: The attributes of this DiagnosticSignature.
        :type attributes: DiagnosticSignatureAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this DiagnosticSignature.


        :return: The id of this DiagnosticSignature.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DiagnosticSignature.


        :param id: The id of this DiagnosticSignature.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this DiagnosticSignature.


        :return: The links of this DiagnosticSignature.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this DiagnosticSignature.


        :param links: The links of this DiagnosticSignature.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def type(self) -> str:
        """Gets the type of this DiagnosticSignature.


        :return: The type of this DiagnosticSignature.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this DiagnosticSignature.


        :param type: The type of this DiagnosticSignature.
        :type type: str
        """
        allowed_values = ["diagnosticSignatures"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
