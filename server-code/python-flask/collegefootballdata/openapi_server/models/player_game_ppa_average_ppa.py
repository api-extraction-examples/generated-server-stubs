from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PlayerGamePPAAveragePPA(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, all=None, _pass=None, rush=None):  # noqa: E501
        """PlayerGamePPAAveragePPA - a model defined in OpenAPI

        :param all: The all of this PlayerGamePPAAveragePPA.  # noqa: E501
        :type all: float
        :param _pass: The _pass of this PlayerGamePPAAveragePPA.  # noqa: E501
        :type _pass: float
        :param rush: The rush of this PlayerGamePPAAveragePPA.  # noqa: E501
        :type rush: float
        """
        self.openapi_types = {
            'all': float,
            '_pass': float,
            'rush': float
        }

        self.attribute_map = {
            'all': 'all',
            '_pass': 'pass',
            'rush': 'rush'
        }

        self._all = all
        self.__pass = _pass
        self._rush = rush

    @classmethod
    def from_dict(cls, dikt) -> 'PlayerGamePPAAveragePPA':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlayerGamePPA_averagePPA of this PlayerGamePPAAveragePPA.  # noqa: E501
        :rtype: PlayerGamePPAAveragePPA
        """
        return util.deserialize_model(dikt, cls)

    @property
    def all(self) -> float:
        """Gets the all of this PlayerGamePPAAveragePPA.


        :return: The all of this PlayerGamePPAAveragePPA.
        :rtype: float
        """
        return self._all

    @all.setter
    def all(self, all: float):
        """Sets the all of this PlayerGamePPAAveragePPA.


        :param all: The all of this PlayerGamePPAAveragePPA.
        :type all: float
        """

        self._all = all

    @property
    def _pass(self) -> float:
        """Gets the _pass of this PlayerGamePPAAveragePPA.


        :return: The _pass of this PlayerGamePPAAveragePPA.
        :rtype: float
        """
        return self.__pass

    @_pass.setter
    def _pass(self, _pass: float):
        """Sets the _pass of this PlayerGamePPAAveragePPA.


        :param _pass: The _pass of this PlayerGamePPAAveragePPA.
        :type _pass: float
        """

        self.__pass = _pass

    @property
    def rush(self) -> float:
        """Gets the rush of this PlayerGamePPAAveragePPA.


        :return: The rush of this PlayerGamePPAAveragePPA.
        :rtype: float
        """
        return self._rush

    @rush.setter
    def rush(self, rush: float):
        """Sets the rush of this PlayerGamePPAAveragePPA.


        :param rush: The rush of this PlayerGamePPAAveragePPA.
        :type rush: float
        """

        self._rush = rush