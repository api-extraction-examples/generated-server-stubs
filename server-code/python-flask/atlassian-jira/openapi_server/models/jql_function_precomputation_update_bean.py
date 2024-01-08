from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class JqlFunctionPrecomputationUpdateBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, value=None):  # noqa: E501
        """JqlFunctionPrecomputationUpdateBean - a model defined in OpenAPI

        :param id: The id of this JqlFunctionPrecomputationUpdateBean.  # noqa: E501
        :type id: int
        :param value: The value of this JqlFunctionPrecomputationUpdateBean.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'id': int,
            'value': str
        }

        self.attribute_map = {
            'id': 'id',
            'value': 'value'
        }

        self._id = id
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'JqlFunctionPrecomputationUpdateBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JqlFunctionPrecomputationUpdateBean of this JqlFunctionPrecomputationUpdateBean.  # noqa: E501
        :rtype: JqlFunctionPrecomputationUpdateBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this JqlFunctionPrecomputationUpdateBean.


        :return: The id of this JqlFunctionPrecomputationUpdateBean.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this JqlFunctionPrecomputationUpdateBean.


        :param id: The id of this JqlFunctionPrecomputationUpdateBean.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def value(self) -> str:
        """Gets the value of this JqlFunctionPrecomputationUpdateBean.


        :return: The value of this JqlFunctionPrecomputationUpdateBean.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this JqlFunctionPrecomputationUpdateBean.


        :param value: The value of this JqlFunctionPrecomputationUpdateBean.
        :type value: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value