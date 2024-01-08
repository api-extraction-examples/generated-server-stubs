from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Priority(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, icon_url=None, id=None, is_default=None, name=None, _self=None, status_color=None):  # noqa: E501
        """Priority - a model defined in OpenAPI

        :param description: The description of this Priority.  # noqa: E501
        :type description: str
        :param icon_url: The icon_url of this Priority.  # noqa: E501
        :type icon_url: str
        :param id: The id of this Priority.  # noqa: E501
        :type id: str
        :param is_default: The is_default of this Priority.  # noqa: E501
        :type is_default: bool
        :param name: The name of this Priority.  # noqa: E501
        :type name: str
        :param _self: The _self of this Priority.  # noqa: E501
        :type _self: str
        :param status_color: The status_color of this Priority.  # noqa: E501
        :type status_color: str
        """
        self.openapi_types = {
            'description': str,
            'icon_url': str,
            'id': str,
            'is_default': bool,
            'name': str,
            '_self': str,
            'status_color': str
        }

        self.attribute_map = {
            'description': 'description',
            'icon_url': 'iconUrl',
            'id': 'id',
            'is_default': 'isDefault',
            'name': 'name',
            '_self': 'self',
            'status_color': 'statusColor'
        }

        self._description = description
        self._icon_url = icon_url
        self._id = id
        self._is_default = is_default
        self._name = name
        self.__self = _self
        self._status_color = status_color

    @classmethod
    def from_dict(cls, dikt) -> 'Priority':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Priority of this Priority.  # noqa: E501
        :rtype: Priority
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this Priority.

        The description of the issue priority.  # noqa: E501

        :return: The description of this Priority.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this Priority.

        The description of the issue priority.  # noqa: E501

        :param description: The description of this Priority.
        :type description: str
        """

        self._description = description

    @property
    def icon_url(self) -> str:
        """Gets the icon_url of this Priority.

        The URL of the icon for the issue priority.  # noqa: E501

        :return: The icon_url of this Priority.
        :rtype: str
        """
        return self._icon_url

    @icon_url.setter
    def icon_url(self, icon_url: str):
        """Sets the icon_url of this Priority.

        The URL of the icon for the issue priority.  # noqa: E501

        :param icon_url: The icon_url of this Priority.
        :type icon_url: str
        """

        self._icon_url = icon_url

    @property
    def id(self) -> str:
        """Gets the id of this Priority.

        The ID of the issue priority.  # noqa: E501

        :return: The id of this Priority.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Priority.

        The ID of the issue priority.  # noqa: E501

        :param id: The id of this Priority.
        :type id: str
        """

        self._id = id

    @property
    def is_default(self) -> bool:
        """Gets the is_default of this Priority.

        Whether this priority is the default.  # noqa: E501

        :return: The is_default of this Priority.
        :rtype: bool
        """
        return self._is_default

    @is_default.setter
    def is_default(self, is_default: bool):
        """Sets the is_default of this Priority.

        Whether this priority is the default.  # noqa: E501

        :param is_default: The is_default of this Priority.
        :type is_default: bool
        """

        self._is_default = is_default

    @property
    def name(self) -> str:
        """Gets the name of this Priority.

        The name of the issue priority.  # noqa: E501

        :return: The name of this Priority.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Priority.

        The name of the issue priority.  # noqa: E501

        :param name: The name of this Priority.
        :type name: str
        """

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this Priority.

        The URL of the issue priority.  # noqa: E501

        :return: The _self of this Priority.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this Priority.

        The URL of the issue priority.  # noqa: E501

        :param _self: The _self of this Priority.
        :type _self: str
        """

        self.__self = _self

    @property
    def status_color(self) -> str:
        """Gets the status_color of this Priority.

        The color used to indicate the issue priority.  # noqa: E501

        :return: The status_color of this Priority.
        :rtype: str
        """
        return self._status_color

    @status_color.setter
    def status_color(self, status_color: str):
        """Sets the status_color of this Priority.

        The color used to indicate the issue priority.  # noqa: E501

        :param status_color: The status_color of this Priority.
        :type status_color: str
        """

        self._status_color = status_color