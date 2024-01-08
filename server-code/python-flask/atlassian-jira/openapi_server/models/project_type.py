from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, color=None, description_i18n_key=None, formatted_key=None, icon=None, key=None):  # noqa: E501
        """ProjectType - a model defined in OpenAPI

        :param color: The color of this ProjectType.  # noqa: E501
        :type color: str
        :param description_i18n_key: The description_i18n_key of this ProjectType.  # noqa: E501
        :type description_i18n_key: str
        :param formatted_key: The formatted_key of this ProjectType.  # noqa: E501
        :type formatted_key: str
        :param icon: The icon of this ProjectType.  # noqa: E501
        :type icon: str
        :param key: The key of this ProjectType.  # noqa: E501
        :type key: str
        """
        self.openapi_types = {
            'color': str,
            'description_i18n_key': str,
            'formatted_key': str,
            'icon': str,
            'key': str
        }

        self.attribute_map = {
            'color': 'color',
            'description_i18n_key': 'descriptionI18nKey',
            'formatted_key': 'formattedKey',
            'icon': 'icon',
            'key': 'key'
        }

        self._color = color
        self._description_i18n_key = description_i18n_key
        self._formatted_key = formatted_key
        self._icon = icon
        self._key = key

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectType of this ProjectType.  # noqa: E501
        :rtype: ProjectType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def color(self) -> str:
        """Gets the color of this ProjectType.

        The color of the project type.  # noqa: E501

        :return: The color of this ProjectType.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this ProjectType.

        The color of the project type.  # noqa: E501

        :param color: The color of this ProjectType.
        :type color: str
        """

        self._color = color

    @property
    def description_i18n_key(self) -> str:
        """Gets the description_i18n_key of this ProjectType.

        The key of the project type's description.  # noqa: E501

        :return: The description_i18n_key of this ProjectType.
        :rtype: str
        """
        return self._description_i18n_key

    @description_i18n_key.setter
    def description_i18n_key(self, description_i18n_key: str):
        """Sets the description_i18n_key of this ProjectType.

        The key of the project type's description.  # noqa: E501

        :param description_i18n_key: The description_i18n_key of this ProjectType.
        :type description_i18n_key: str
        """

        self._description_i18n_key = description_i18n_key

    @property
    def formatted_key(self) -> str:
        """Gets the formatted_key of this ProjectType.

        The formatted key of the project type.  # noqa: E501

        :return: The formatted_key of this ProjectType.
        :rtype: str
        """
        return self._formatted_key

    @formatted_key.setter
    def formatted_key(self, formatted_key: str):
        """Sets the formatted_key of this ProjectType.

        The formatted key of the project type.  # noqa: E501

        :param formatted_key: The formatted_key of this ProjectType.
        :type formatted_key: str
        """

        self._formatted_key = formatted_key

    @property
    def icon(self) -> str:
        """Gets the icon of this ProjectType.

        The icon of the project type.  # noqa: E501

        :return: The icon of this ProjectType.
        :rtype: str
        """
        return self._icon

    @icon.setter
    def icon(self, icon: str):
        """Sets the icon of this ProjectType.

        The icon of the project type.  # noqa: E501

        :param icon: The icon of this ProjectType.
        :type icon: str
        """

        self._icon = icon

    @property
    def key(self) -> str:
        """Gets the key of this ProjectType.

        The key of the project type.  # noqa: E501

        :return: The key of this ProjectType.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this ProjectType.

        The key of the project type.  # noqa: E501

        :param key: The key of this ProjectType.
        :type key: str
        """

        self._key = key
