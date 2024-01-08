from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GroupLabel(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, text=None, title=None, type=None):  # noqa: E501
        """GroupLabel - a model defined in OpenAPI

        :param text: The text of this GroupLabel.  # noqa: E501
        :type text: str
        :param title: The title of this GroupLabel.  # noqa: E501
        :type title: str
        :param type: The type of this GroupLabel.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'text': str,
            'title': str,
            'type': str
        }

        self.attribute_map = {
            'text': 'text',
            'title': 'title',
            'type': 'type'
        }

        self._text = text
        self._title = title
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'GroupLabel':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GroupLabel of this GroupLabel.  # noqa: E501
        :rtype: GroupLabel
        """
        return util.deserialize_model(dikt, cls)

    @property
    def text(self) -> str:
        """Gets the text of this GroupLabel.

        The group label name.  # noqa: E501

        :return: The text of this GroupLabel.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this GroupLabel.

        The group label name.  # noqa: E501

        :param text: The text of this GroupLabel.
        :type text: str
        """

        self._text = text

    @property
    def title(self) -> str:
        """Gets the title of this GroupLabel.

        The title of the group label.  # noqa: E501

        :return: The title of this GroupLabel.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this GroupLabel.

        The title of the group label.  # noqa: E501

        :param title: The title of this GroupLabel.
        :type title: str
        """

        self._title = title

    @property
    def type(self) -> str:
        """Gets the type of this GroupLabel.

        The type of the group label.  # noqa: E501

        :return: The type of this GroupLabel.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this GroupLabel.

        The type of the group label.  # noqa: E501

        :param type: The type of this GroupLabel.
        :type type: str
        """
        allowed_values = ["ADMIN", "SINGLE", "MULTIPLE"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
