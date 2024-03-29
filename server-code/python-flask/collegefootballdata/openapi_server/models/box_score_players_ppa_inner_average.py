from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BoxScorePlayersPpaInnerAverage(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, passing=None, quarter1=None, quarter2=None, quarter3=None, quarter4=None, rushing=None, total=None):  # noqa: E501
        """BoxScorePlayersPpaInnerAverage - a model defined in OpenAPI

        :param passing: The passing of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type passing: float
        :param quarter1: The quarter1 of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type quarter1: float
        :param quarter2: The quarter2 of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type quarter2: float
        :param quarter3: The quarter3 of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type quarter3: float
        :param quarter4: The quarter4 of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type quarter4: float
        :param rushing: The rushing of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type rushing: float
        :param total: The total of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :type total: float
        """
        self.openapi_types = {
            'passing': float,
            'quarter1': float,
            'quarter2': float,
            'quarter3': float,
            'quarter4': float,
            'rushing': float,
            'total': float
        }

        self.attribute_map = {
            'passing': 'passing',
            'quarter1': 'quarter1',
            'quarter2': 'quarter2',
            'quarter3': 'quarter3',
            'quarter4': 'quarter4',
            'rushing': 'rushing',
            'total': 'total'
        }

        self._passing = passing
        self._quarter1 = quarter1
        self._quarter2 = quarter2
        self._quarter3 = quarter3
        self._quarter4 = quarter4
        self._rushing = rushing
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'BoxScorePlayersPpaInnerAverage':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BoxScore_players_ppa_inner_average of this BoxScorePlayersPpaInnerAverage.  # noqa: E501
        :rtype: BoxScorePlayersPpaInnerAverage
        """
        return util.deserialize_model(dikt, cls)

    @property
    def passing(self) -> float:
        """Gets the passing of this BoxScorePlayersPpaInnerAverage.


        :return: The passing of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._passing

    @passing.setter
    def passing(self, passing: float):
        """Sets the passing of this BoxScorePlayersPpaInnerAverage.


        :param passing: The passing of this BoxScorePlayersPpaInnerAverage.
        :type passing: float
        """

        self._passing = passing

    @property
    def quarter1(self) -> float:
        """Gets the quarter1 of this BoxScorePlayersPpaInnerAverage.


        :return: The quarter1 of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._quarter1

    @quarter1.setter
    def quarter1(self, quarter1: float):
        """Sets the quarter1 of this BoxScorePlayersPpaInnerAverage.


        :param quarter1: The quarter1 of this BoxScorePlayersPpaInnerAverage.
        :type quarter1: float
        """

        self._quarter1 = quarter1

    @property
    def quarter2(self) -> float:
        """Gets the quarter2 of this BoxScorePlayersPpaInnerAverage.


        :return: The quarter2 of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._quarter2

    @quarter2.setter
    def quarter2(self, quarter2: float):
        """Sets the quarter2 of this BoxScorePlayersPpaInnerAverage.


        :param quarter2: The quarter2 of this BoxScorePlayersPpaInnerAverage.
        :type quarter2: float
        """

        self._quarter2 = quarter2

    @property
    def quarter3(self) -> float:
        """Gets the quarter3 of this BoxScorePlayersPpaInnerAverage.


        :return: The quarter3 of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._quarter3

    @quarter3.setter
    def quarter3(self, quarter3: float):
        """Sets the quarter3 of this BoxScorePlayersPpaInnerAverage.


        :param quarter3: The quarter3 of this BoxScorePlayersPpaInnerAverage.
        :type quarter3: float
        """

        self._quarter3 = quarter3

    @property
    def quarter4(self) -> float:
        """Gets the quarter4 of this BoxScorePlayersPpaInnerAverage.


        :return: The quarter4 of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._quarter4

    @quarter4.setter
    def quarter4(self, quarter4: float):
        """Sets the quarter4 of this BoxScorePlayersPpaInnerAverage.


        :param quarter4: The quarter4 of this BoxScorePlayersPpaInnerAverage.
        :type quarter4: float
        """

        self._quarter4 = quarter4

    @property
    def rushing(self) -> float:
        """Gets the rushing of this BoxScorePlayersPpaInnerAverage.


        :return: The rushing of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._rushing

    @rushing.setter
    def rushing(self, rushing: float):
        """Sets the rushing of this BoxScorePlayersPpaInnerAverage.


        :param rushing: The rushing of this BoxScorePlayersPpaInnerAverage.
        :type rushing: float
        """

        self._rushing = rushing

    @property
    def total(self) -> float:
        """Gets the total of this BoxScorePlayersPpaInnerAverage.


        :return: The total of this BoxScorePlayersPpaInnerAverage.
        :rtype: float
        """
        return self._total

    @total.setter
    def total(self, total: float):
        """Sets the total of this BoxScorePlayersPpaInnerAverage.


        :param total: The total of this BoxScorePlayersPpaInnerAverage.
        :type total: float
        """

        self._total = total
