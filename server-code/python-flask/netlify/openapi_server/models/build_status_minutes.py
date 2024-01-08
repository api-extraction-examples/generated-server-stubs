from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BuildStatusMinutes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, current=None, current_average_sec=None, included_minutes=None, included_minutes_with_packs=None, last_updated_at=None, period_end_date=None, period_start_date=None, previous=None):  # noqa: E501
        """BuildStatusMinutes - a model defined in OpenAPI

        :param current: The current of this BuildStatusMinutes.  # noqa: E501
        :type current: int
        :param current_average_sec: The current_average_sec of this BuildStatusMinutes.  # noqa: E501
        :type current_average_sec: int
        :param included_minutes: The included_minutes of this BuildStatusMinutes.  # noqa: E501
        :type included_minutes: str
        :param included_minutes_with_packs: The included_minutes_with_packs of this BuildStatusMinutes.  # noqa: E501
        :type included_minutes_with_packs: str
        :param last_updated_at: The last_updated_at of this BuildStatusMinutes.  # noqa: E501
        :type last_updated_at: str
        :param period_end_date: The period_end_date of this BuildStatusMinutes.  # noqa: E501
        :type period_end_date: str
        :param period_start_date: The period_start_date of this BuildStatusMinutes.  # noqa: E501
        :type period_start_date: str
        :param previous: The previous of this BuildStatusMinutes.  # noqa: E501
        :type previous: int
        """
        self.openapi_types = {
            'current': int,
            'current_average_sec': int,
            'included_minutes': str,
            'included_minutes_with_packs': str,
            'last_updated_at': str,
            'period_end_date': str,
            'period_start_date': str,
            'previous': int
        }

        self.attribute_map = {
            'current': 'current',
            'current_average_sec': 'current_average_sec',
            'included_minutes': 'included_minutes',
            'included_minutes_with_packs': 'included_minutes_with_packs',
            'last_updated_at': 'last_updated_at',
            'period_end_date': 'period_end_date',
            'period_start_date': 'period_start_date',
            'previous': 'previous'
        }

        self._current = current
        self._current_average_sec = current_average_sec
        self._included_minutes = included_minutes
        self._included_minutes_with_packs = included_minutes_with_packs
        self._last_updated_at = last_updated_at
        self._period_end_date = period_end_date
        self._period_start_date = period_start_date
        self._previous = previous

    @classmethod
    def from_dict(cls, dikt) -> 'BuildStatusMinutes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The buildStatus_minutes of this BuildStatusMinutes.  # noqa: E501
        :rtype: BuildStatusMinutes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def current(self) -> int:
        """Gets the current of this BuildStatusMinutes.


        :return: The current of this BuildStatusMinutes.
        :rtype: int
        """
        return self._current

    @current.setter
    def current(self, current: int):
        """Sets the current of this BuildStatusMinutes.


        :param current: The current of this BuildStatusMinutes.
        :type current: int
        """

        self._current = current

    @property
    def current_average_sec(self) -> int:
        """Gets the current_average_sec of this BuildStatusMinutes.


        :return: The current_average_sec of this BuildStatusMinutes.
        :rtype: int
        """
        return self._current_average_sec

    @current_average_sec.setter
    def current_average_sec(self, current_average_sec: int):
        """Sets the current_average_sec of this BuildStatusMinutes.


        :param current_average_sec: The current_average_sec of this BuildStatusMinutes.
        :type current_average_sec: int
        """

        self._current_average_sec = current_average_sec

    @property
    def included_minutes(self) -> str:
        """Gets the included_minutes of this BuildStatusMinutes.


        :return: The included_minutes of this BuildStatusMinutes.
        :rtype: str
        """
        return self._included_minutes

    @included_minutes.setter
    def included_minutes(self, included_minutes: str):
        """Sets the included_minutes of this BuildStatusMinutes.


        :param included_minutes: The included_minutes of this BuildStatusMinutes.
        :type included_minutes: str
        """

        self._included_minutes = included_minutes

    @property
    def included_minutes_with_packs(self) -> str:
        """Gets the included_minutes_with_packs of this BuildStatusMinutes.


        :return: The included_minutes_with_packs of this BuildStatusMinutes.
        :rtype: str
        """
        return self._included_minutes_with_packs

    @included_minutes_with_packs.setter
    def included_minutes_with_packs(self, included_minutes_with_packs: str):
        """Sets the included_minutes_with_packs of this BuildStatusMinutes.


        :param included_minutes_with_packs: The included_minutes_with_packs of this BuildStatusMinutes.
        :type included_minutes_with_packs: str
        """

        self._included_minutes_with_packs = included_minutes_with_packs

    @property
    def last_updated_at(self) -> str:
        """Gets the last_updated_at of this BuildStatusMinutes.


        :return: The last_updated_at of this BuildStatusMinutes.
        :rtype: str
        """
        return self._last_updated_at

    @last_updated_at.setter
    def last_updated_at(self, last_updated_at: str):
        """Sets the last_updated_at of this BuildStatusMinutes.


        :param last_updated_at: The last_updated_at of this BuildStatusMinutes.
        :type last_updated_at: str
        """

        self._last_updated_at = last_updated_at

    @property
    def period_end_date(self) -> str:
        """Gets the period_end_date of this BuildStatusMinutes.


        :return: The period_end_date of this BuildStatusMinutes.
        :rtype: str
        """
        return self._period_end_date

    @period_end_date.setter
    def period_end_date(self, period_end_date: str):
        """Sets the period_end_date of this BuildStatusMinutes.


        :param period_end_date: The period_end_date of this BuildStatusMinutes.
        :type period_end_date: str
        """

        self._period_end_date = period_end_date

    @property
    def period_start_date(self) -> str:
        """Gets the period_start_date of this BuildStatusMinutes.


        :return: The period_start_date of this BuildStatusMinutes.
        :rtype: str
        """
        return self._period_start_date

    @period_start_date.setter
    def period_start_date(self, period_start_date: str):
        """Sets the period_start_date of this BuildStatusMinutes.


        :param period_start_date: The period_start_date of this BuildStatusMinutes.
        :type period_start_date: str
        """

        self._period_start_date = period_start_date

    @property
    def previous(self) -> int:
        """Gets the previous of this BuildStatusMinutes.


        :return: The previous of this BuildStatusMinutes.
        :rtype: int
        """
        return self._previous

    @previous.setter
    def previous(self, previous: int):
        """Sets the previous of this BuildStatusMinutes.


        :param previous: The previous of this BuildStatusMinutes.
        :type previous: int
        """

        self._previous = previous