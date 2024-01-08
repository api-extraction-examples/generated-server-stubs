from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Miscellaneous(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, title=None):  # noqa: E501
        """Miscellaneous - a model defined in OpenAPI

        :param title: The title of this Miscellaneous.  # noqa: E501
        :type title: str
        """
        self.openapi_types = {
            'title': str
        }

        self.attribute_map = {
            'title': 'title'
        }

        self._title = title

    @classmethod
    def from_dict(cls, dikt) -> 'Miscellaneous':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Miscellaneous of this Miscellaneous.  # noqa: E501
        :rtype: Miscellaneous
        """
        return util.deserialize_model(dikt, cls)

    @property
    def title(self) -> str:
        """Gets the title of this Miscellaneous.


        :return: The title of this Miscellaneous.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this Miscellaneous.


        :param title: The title of this Miscellaneous.
        :type title: str
        """
        if title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title