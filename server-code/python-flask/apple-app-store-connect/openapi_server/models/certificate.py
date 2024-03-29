from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.certificate_attributes import CertificateAttributes
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.certificate_attributes import CertificateAttributes  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class Certificate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, type=None):  # noqa: E501
        """Certificate - a model defined in OpenAPI

        :param attributes: The attributes of this Certificate.  # noqa: E501
        :type attributes: CertificateAttributes
        :param id: The id of this Certificate.  # noqa: E501
        :type id: str
        :param links: The links of this Certificate.  # noqa: E501
        :type links: ResourceLinks
        :param type: The type of this Certificate.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': CertificateAttributes,
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
    def from_dict(cls, dikt) -> 'Certificate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Certificate of this Certificate.  # noqa: E501
        :rtype: Certificate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> CertificateAttributes:
        """Gets the attributes of this Certificate.


        :return: The attributes of this Certificate.
        :rtype: CertificateAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: CertificateAttributes):
        """Sets the attributes of this Certificate.


        :param attributes: The attributes of this Certificate.
        :type attributes: CertificateAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this Certificate.


        :return: The id of this Certificate.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Certificate.


        :param id: The id of this Certificate.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this Certificate.


        :return: The links of this Certificate.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this Certificate.


        :param links: The links of this Certificate.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def type(self) -> str:
        """Gets the type of this Certificate.


        :return: The type of this Certificate.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this Certificate.


        :param type: The type of this Certificate.
        :type type: str
        """
        allowed_values = ["certificates"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
