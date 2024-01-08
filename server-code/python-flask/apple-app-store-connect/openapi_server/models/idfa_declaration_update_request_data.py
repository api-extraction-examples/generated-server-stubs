from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.idfa_declaration_attributes import IdfaDeclarationAttributes
from openapi_server import util

from openapi_server.models.idfa_declaration_attributes import IdfaDeclarationAttributes  # noqa: E501

class IdfaDeclarationUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """IdfaDeclarationUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this IdfaDeclarationUpdateRequestData.  # noqa: E501
        :type attributes: IdfaDeclarationAttributes
        :param id: The id of this IdfaDeclarationUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this IdfaDeclarationUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': IdfaDeclarationAttributes,
            'id': str,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'IdfaDeclarationUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IdfaDeclarationUpdateRequest_data of this IdfaDeclarationUpdateRequestData.  # noqa: E501
        :rtype: IdfaDeclarationUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> IdfaDeclarationAttributes:
        """Gets the attributes of this IdfaDeclarationUpdateRequestData.


        :return: The attributes of this IdfaDeclarationUpdateRequestData.
        :rtype: IdfaDeclarationAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: IdfaDeclarationAttributes):
        """Sets the attributes of this IdfaDeclarationUpdateRequestData.


        :param attributes: The attributes of this IdfaDeclarationUpdateRequestData.
        :type attributes: IdfaDeclarationAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this IdfaDeclarationUpdateRequestData.


        :return: The id of this IdfaDeclarationUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IdfaDeclarationUpdateRequestData.


        :param id: The id of this IdfaDeclarationUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this IdfaDeclarationUpdateRequestData.


        :return: The type of this IdfaDeclarationUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this IdfaDeclarationUpdateRequestData.


        :param type: The type of this IdfaDeclarationUpdateRequestData.
        :type type: str
        """
        allowed_values = ["idfaDeclarations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
