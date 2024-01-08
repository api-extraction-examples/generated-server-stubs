from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PluginMount(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, destination=None, name=None, options=None, settable=None, source=None, type=None):  # noqa: E501
        """PluginMount - a model defined in OpenAPI

        :param description: The description of this PluginMount.  # noqa: E501
        :type description: str
        :param destination: The destination of this PluginMount.  # noqa: E501
        :type destination: str
        :param name: The name of this PluginMount.  # noqa: E501
        :type name: str
        :param options: The options of this PluginMount.  # noqa: E501
        :type options: List[str]
        :param settable: The settable of this PluginMount.  # noqa: E501
        :type settable: List[str]
        :param source: The source of this PluginMount.  # noqa: E501
        :type source: str
        :param type: The type of this PluginMount.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'description': str,
            'destination': str,
            'name': str,
            'options': List[str],
            'settable': List[str],
            'source': str,
            'type': str
        }

        self.attribute_map = {
            'description': 'Description',
            'destination': 'Destination',
            'name': 'Name',
            'options': 'Options',
            'settable': 'Settable',
            'source': 'Source',
            'type': 'Type'
        }

        self._description = description
        self._destination = destination
        self._name = name
        self._options = options
        self._settable = settable
        self._source = source
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'PluginMount':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PluginMount of this PluginMount.  # noqa: E501
        :rtype: PluginMount
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this PluginMount.


        :return: The description of this PluginMount.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this PluginMount.


        :param description: The description of this PluginMount.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def destination(self) -> str:
        """Gets the destination of this PluginMount.


        :return: The destination of this PluginMount.
        :rtype: str
        """
        return self._destination

    @destination.setter
    def destination(self, destination: str):
        """Sets the destination of this PluginMount.


        :param destination: The destination of this PluginMount.
        :type destination: str
        """
        if destination is None:
            raise ValueError("Invalid value for `destination`, must not be `None`")  # noqa: E501

        self._destination = destination

    @property
    def name(self) -> str:
        """Gets the name of this PluginMount.


        :return: The name of this PluginMount.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PluginMount.


        :param name: The name of this PluginMount.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def options(self) -> List[str]:
        """Gets the options of this PluginMount.


        :return: The options of this PluginMount.
        :rtype: List[str]
        """
        return self._options

    @options.setter
    def options(self, options: List[str]):
        """Sets the options of this PluginMount.


        :param options: The options of this PluginMount.
        :type options: List[str]
        """
        if options is None:
            raise ValueError("Invalid value for `options`, must not be `None`")  # noqa: E501

        self._options = options

    @property
    def settable(self) -> List[str]:
        """Gets the settable of this PluginMount.


        :return: The settable of this PluginMount.
        :rtype: List[str]
        """
        return self._settable

    @settable.setter
    def settable(self, settable: List[str]):
        """Sets the settable of this PluginMount.


        :param settable: The settable of this PluginMount.
        :type settable: List[str]
        """
        if settable is None:
            raise ValueError("Invalid value for `settable`, must not be `None`")  # noqa: E501

        self._settable = settable

    @property
    def source(self) -> str:
        """Gets the source of this PluginMount.


        :return: The source of this PluginMount.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this PluginMount.


        :param source: The source of this PluginMount.
        :type source: str
        """
        if source is None:
            raise ValueError("Invalid value for `source`, must not be `None`")  # noqa: E501

        self._source = source

    @property
    def type(self) -> str:
        """Gets the type of this PluginMount.


        :return: The type of this PluginMount.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PluginMount.


        :param type: The type of this PluginMount.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
