from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PodcastSynopses(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, long=None, medium=None, short=None, type=None):  # noqa: E501
        """PodcastSynopses - a model defined in OpenAPI

        :param long: The long of this PodcastSynopses.  # noqa: E501
        :type long: str
        :param medium: The medium of this PodcastSynopses.  # noqa: E501
        :type medium: str
        :param short: The short of this PodcastSynopses.  # noqa: E501
        :type short: str
        :param type: The type of this PodcastSynopses.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'long': str,
            'medium': str,
            'short': str,
            'type': str
        }

        self.attribute_map = {
            'long': 'long',
            'medium': 'medium',
            'short': 'short',
            'type': 'type'
        }

        self._long = long
        self._medium = medium
        self._short = short
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'PodcastSynopses':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PodcastSynopses of this PodcastSynopses.  # noqa: E501
        :rtype: PodcastSynopses
        """
        return util.deserialize_model(dikt, cls)

    @property
    def long(self) -> str:
        """Gets the long of this PodcastSynopses.


        :return: The long of this PodcastSynopses.
        :rtype: str
        """
        return self._long

    @long.setter
    def long(self, long: str):
        """Sets the long of this PodcastSynopses.


        :param long: The long of this PodcastSynopses.
        :type long: str
        """
        if long is None:
            raise ValueError("Invalid value for `long`, must not be `None`")  # noqa: E501

        self._long = long

    @property
    def medium(self) -> str:
        """Gets the medium of this PodcastSynopses.


        :return: The medium of this PodcastSynopses.
        :rtype: str
        """
        return self._medium

    @medium.setter
    def medium(self, medium: str):
        """Sets the medium of this PodcastSynopses.


        :param medium: The medium of this PodcastSynopses.
        :type medium: str
        """
        if medium is None:
            raise ValueError("Invalid value for `medium`, must not be `None`")  # noqa: E501

        self._medium = medium

    @property
    def short(self) -> str:
        """Gets the short of this PodcastSynopses.


        :return: The short of this PodcastSynopses.
        :rtype: str
        """
        return self._short

    @short.setter
    def short(self, short: str):
        """Sets the short of this PodcastSynopses.


        :param short: The short of this PodcastSynopses.
        :type short: str
        """
        if short is None:
            raise ValueError("Invalid value for `short`, must not be `None`")  # noqa: E501

        self._short = short

    @property
    def type(self) -> str:
        """Gets the type of this PodcastSynopses.


        :return: The type of this PodcastSynopses.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PodcastSynopses.


        :param type: The type of this PodcastSynopses.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
