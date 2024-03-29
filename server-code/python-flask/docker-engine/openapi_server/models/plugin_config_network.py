from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PluginConfigNetwork(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None):  # noqa: E501
        """PluginConfigNetwork - a model defined in OpenAPI

        :param type: The type of this PluginConfigNetwork.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'type': str
        }

        self.attribute_map = {
            'type': 'Type'
        }

        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'PluginConfigNetwork':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Plugin_Config_Network of this PluginConfigNetwork.  # noqa: E501
        :rtype: PluginConfigNetwork
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this PluginConfigNetwork.


        :return: The type of this PluginConfigNetwork.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PluginConfigNetwork.


        :param type: The type of this PluginConfigNetwork.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
