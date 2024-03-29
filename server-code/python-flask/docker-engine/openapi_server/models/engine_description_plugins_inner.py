from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EngineDescriptionPluginsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, type=None):  # noqa: E501
        """EngineDescriptionPluginsInner - a model defined in OpenAPI

        :param name: The name of this EngineDescriptionPluginsInner.  # noqa: E501
        :type name: str
        :param type: The type of this EngineDescriptionPluginsInner.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'name': str,
            'type': str
        }

        self.attribute_map = {
            'name': 'Name',
            'type': 'Type'
        }

        self._name = name
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'EngineDescriptionPluginsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EngineDescription_Plugins_inner of this EngineDescriptionPluginsInner.  # noqa: E501
        :rtype: EngineDescriptionPluginsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this EngineDescriptionPluginsInner.


        :return: The name of this EngineDescriptionPluginsInner.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this EngineDescriptionPluginsInner.


        :param name: The name of this EngineDescriptionPluginsInner.
        :type name: str
        """

        self._name = name

    @property
    def type(self) -> str:
        """Gets the type of this EngineDescriptionPluginsInner.


        :return: The type of this EngineDescriptionPluginsInner.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this EngineDescriptionPluginsInner.


        :param type: The type of this EngineDescriptionPluginsInner.
        :type type: str
        """

        self._type = type
