from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PlayerSeasonPPAAveragePPA(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, all=None, first_down=None, _pass=None, passing_downs=None, rush=None, second_down=None, standard_downs=None, third_down=None):  # noqa: E501
        """PlayerSeasonPPAAveragePPA - a model defined in OpenAPI

        :param all: The all of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type all: float
        :param first_down: The first_down of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type first_down: float
        :param _pass: The _pass of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type _pass: float
        :param passing_downs: The passing_downs of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type passing_downs: float
        :param rush: The rush of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type rush: float
        :param second_down: The second_down of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type second_down: float
        :param standard_downs: The standard_downs of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type standard_downs: float
        :param third_down: The third_down of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :type third_down: float
        """
        self.openapi_types = {
            'all': float,
            'first_down': float,
            '_pass': float,
            'passing_downs': float,
            'rush': float,
            'second_down': float,
            'standard_downs': float,
            'third_down': float
        }

        self.attribute_map = {
            'all': 'all',
            'first_down': 'firstDown',
            '_pass': 'pass',
            'passing_downs': 'passingDowns',
            'rush': 'rush',
            'second_down': 'secondDown',
            'standard_downs': 'standardDowns',
            'third_down': 'thirdDown'
        }

        self._all = all
        self._first_down = first_down
        self.__pass = _pass
        self._passing_downs = passing_downs
        self._rush = rush
        self._second_down = second_down
        self._standard_downs = standard_downs
        self._third_down = third_down

    @classmethod
    def from_dict(cls, dikt) -> 'PlayerSeasonPPAAveragePPA':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlayerSeasonPPA_averagePPA of this PlayerSeasonPPAAveragePPA.  # noqa: E501
        :rtype: PlayerSeasonPPAAveragePPA
        """
        return util.deserialize_model(dikt, cls)

    @property
    def all(self) -> float:
        """Gets the all of this PlayerSeasonPPAAveragePPA.


        :return: The all of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._all

    @all.setter
    def all(self, all: float):
        """Sets the all of this PlayerSeasonPPAAveragePPA.


        :param all: The all of this PlayerSeasonPPAAveragePPA.
        :type all: float
        """

        self._all = all

    @property
    def first_down(self) -> float:
        """Gets the first_down of this PlayerSeasonPPAAveragePPA.


        :return: The first_down of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._first_down

    @first_down.setter
    def first_down(self, first_down: float):
        """Sets the first_down of this PlayerSeasonPPAAveragePPA.


        :param first_down: The first_down of this PlayerSeasonPPAAveragePPA.
        :type first_down: float
        """

        self._first_down = first_down

    @property
    def _pass(self) -> float:
        """Gets the _pass of this PlayerSeasonPPAAveragePPA.


        :return: The _pass of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self.__pass

    @_pass.setter
    def _pass(self, _pass: float):
        """Sets the _pass of this PlayerSeasonPPAAveragePPA.


        :param _pass: The _pass of this PlayerSeasonPPAAveragePPA.
        :type _pass: float
        """

        self.__pass = _pass

    @property
    def passing_downs(self) -> float:
        """Gets the passing_downs of this PlayerSeasonPPAAveragePPA.


        :return: The passing_downs of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._passing_downs

    @passing_downs.setter
    def passing_downs(self, passing_downs: float):
        """Sets the passing_downs of this PlayerSeasonPPAAveragePPA.


        :param passing_downs: The passing_downs of this PlayerSeasonPPAAveragePPA.
        :type passing_downs: float
        """

        self._passing_downs = passing_downs

    @property
    def rush(self) -> float:
        """Gets the rush of this PlayerSeasonPPAAveragePPA.


        :return: The rush of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._rush

    @rush.setter
    def rush(self, rush: float):
        """Sets the rush of this PlayerSeasonPPAAveragePPA.


        :param rush: The rush of this PlayerSeasonPPAAveragePPA.
        :type rush: float
        """

        self._rush = rush

    @property
    def second_down(self) -> float:
        """Gets the second_down of this PlayerSeasonPPAAveragePPA.


        :return: The second_down of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._second_down

    @second_down.setter
    def second_down(self, second_down: float):
        """Sets the second_down of this PlayerSeasonPPAAveragePPA.


        :param second_down: The second_down of this PlayerSeasonPPAAveragePPA.
        :type second_down: float
        """

        self._second_down = second_down

    @property
    def standard_downs(self) -> float:
        """Gets the standard_downs of this PlayerSeasonPPAAveragePPA.


        :return: The standard_downs of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._standard_downs

    @standard_downs.setter
    def standard_downs(self, standard_downs: float):
        """Sets the standard_downs of this PlayerSeasonPPAAveragePPA.


        :param standard_downs: The standard_downs of this PlayerSeasonPPAAveragePPA.
        :type standard_downs: float
        """

        self._standard_downs = standard_downs

    @property
    def third_down(self) -> float:
        """Gets the third_down of this PlayerSeasonPPAAveragePPA.


        :return: The third_down of this PlayerSeasonPPAAveragePPA.
        :rtype: float
        """
        return self._third_down

    @third_down.setter
    def third_down(self, third_down: float):
        """Sets the third_down of this PlayerSeasonPPAAveragePPA.


        :param third_down: The third_down of this PlayerSeasonPPAAveragePPA.
        :type third_down: float
        """

        self._third_down = third_down
