from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Dates(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, end_date=None, start_date=None):  # noqa: E501
        """Dates - a model defined in OpenAPI

        :param end_date: The end_date of this Dates.  # noqa: E501
        :type end_date: date
        :param start_date: The start_date of this Dates.  # noqa: E501
        :type start_date: date
        """
        self.openapi_types = {
            'end_date': date,
            'start_date': date
        }

        self.attribute_map = {
            'end_date': 'endDate',
            'start_date': 'startDate'
        }

        self._end_date = end_date
        self._start_date = start_date

    @classmethod
    def from_dict(cls, dikt) -> 'Dates':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The dates of this Dates.  # noqa: E501
        :rtype: Dates
        """
        return util.deserialize_model(dikt, cls)

    @property
    def end_date(self) -> date:
        """Gets the end_date of this Dates.


        :return: The end_date of this Dates.
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date: date):
        """Sets the end_date of this Dates.


        :param end_date: The end_date of this Dates.
        :type end_date: date
        """
        if end_date is None:
            raise ValueError("Invalid value for `end_date`, must not be `None`")  # noqa: E501

        self._end_date = end_date

    @property
    def start_date(self) -> date:
        """Gets the start_date of this Dates.


        :return: The start_date of this Dates.
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: date):
        """Sets the start_date of this Dates.


        :param start_date: The start_date of this Dates.
        :type start_date: date
        """
        if start_date is None:
            raise ValueError("Invalid value for `start_date`, must not be `None`")  # noqa: E501

        self._start_date = start_date
