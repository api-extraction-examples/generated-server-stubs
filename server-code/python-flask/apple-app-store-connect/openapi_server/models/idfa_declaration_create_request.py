from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.idfa_declaration_create_request_data import IdfaDeclarationCreateRequestData
from openapi_server import util

from openapi_server.models.idfa_declaration_create_request_data import IdfaDeclarationCreateRequestData  # noqa: E501

class IdfaDeclarationCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """IdfaDeclarationCreateRequest - a model defined in OpenAPI

        :param data: The data of this IdfaDeclarationCreateRequest.  # noqa: E501
        :type data: IdfaDeclarationCreateRequestData
        """
        self.openapi_types = {
            'data': IdfaDeclarationCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'IdfaDeclarationCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IdfaDeclarationCreateRequest of this IdfaDeclarationCreateRequest.  # noqa: E501
        :rtype: IdfaDeclarationCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> IdfaDeclarationCreateRequestData:
        """Gets the data of this IdfaDeclarationCreateRequest.


        :return: The data of this IdfaDeclarationCreateRequest.
        :rtype: IdfaDeclarationCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: IdfaDeclarationCreateRequestData):
        """Sets the data of this IdfaDeclarationCreateRequest.


        :param data: The data of this IdfaDeclarationCreateRequest.
        :type data: IdfaDeclarationCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
