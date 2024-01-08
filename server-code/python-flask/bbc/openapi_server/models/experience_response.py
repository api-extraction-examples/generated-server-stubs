from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.display_module import DisplayModule
from openapi_server import util

from openapi_server.models.display_module import DisplayModule  # noqa: E501

class ExperienceResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _schema=None, data=None):  # noqa: E501
        """ExperienceResponse - a model defined in OpenAPI

        :param _schema: The _schema of this ExperienceResponse.  # noqa: E501
        :type _schema: str
        :param data: The data of this ExperienceResponse.  # noqa: E501
        :type data: List[DisplayModule]
        """
        self.openapi_types = {
            '_schema': str,
            'data': List[DisplayModule]
        }

        self.attribute_map = {
            '_schema': '$schema',
            'data': 'data'
        }

        self.__schema = _schema
        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'ExperienceResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ExperienceResponse of this ExperienceResponse.  # noqa: E501
        :rtype: ExperienceResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _schema(self) -> str:
        """Gets the _schema of this ExperienceResponse.


        :return: The _schema of this ExperienceResponse.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this ExperienceResponse.


        :param _schema: The _schema of this ExperienceResponse.
        :type _schema: str
        """
        if _schema is None:
            raise ValueError("Invalid value for `_schema`, must not be `None`")  # noqa: E501

        self.__schema = _schema

    @property
    def data(self) -> List[DisplayModule]:
        """Gets the data of this ExperienceResponse.


        :return: The data of this ExperienceResponse.
        :rtype: List[DisplayModule]
        """
        return self._data

    @data.setter
    def data(self, data: List[DisplayModule]):
        """Sets the data of this ExperienceResponse.


        :param data: The data of this ExperienceResponse.
        :type data: List[DisplayModule]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
