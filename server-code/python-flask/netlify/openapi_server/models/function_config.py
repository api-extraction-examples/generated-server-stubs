from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class FunctionConfig(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, display_name=None, generator=None):  # noqa: E501
        """FunctionConfig - a model defined in OpenAPI

        :param display_name: The display_name of this FunctionConfig.  # noqa: E501
        :type display_name: str
        :param generator: The generator of this FunctionConfig.  # noqa: E501
        :type generator: str
        """
        self.openapi_types = {
            'display_name': str,
            'generator': str
        }

        self.attribute_map = {
            'display_name': 'display_name',
            'generator': 'generator'
        }

        self._display_name = display_name
        self._generator = generator

    @classmethod
    def from_dict(cls, dikt) -> 'FunctionConfig':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The functionConfig of this FunctionConfig.  # noqa: E501
        :rtype: FunctionConfig
        """
        return util.deserialize_model(dikt, cls)

    @property
    def display_name(self) -> str:
        """Gets the display_name of this FunctionConfig.


        :return: The display_name of this FunctionConfig.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name: str):
        """Sets the display_name of this FunctionConfig.


        :param display_name: The display_name of this FunctionConfig.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def generator(self) -> str:
        """Gets the generator of this FunctionConfig.


        :return: The generator of this FunctionConfig.
        :rtype: str
        """
        return self._generator

    @generator.setter
    def generator(self, generator: str):
        """Sets the generator of this FunctionConfig.


        :param generator: The generator of this FunctionConfig.
        :type generator: str
        """

        self._generator = generator
