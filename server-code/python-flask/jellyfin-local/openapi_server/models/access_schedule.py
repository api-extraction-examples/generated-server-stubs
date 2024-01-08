from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.dynamic_day_of_week import DynamicDayOfWeek
from openapi_server import util

from openapi_server.models.dynamic_day_of_week import DynamicDayOfWeek  # noqa: E501

class AccessSchedule(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, day_of_week=None, end_hour=None, id=None, start_hour=None, user_id=None):  # noqa: E501
        """AccessSchedule - a model defined in OpenAPI

        :param day_of_week: The day_of_week of this AccessSchedule.  # noqa: E501
        :type day_of_week: DynamicDayOfWeek
        :param end_hour: The end_hour of this AccessSchedule.  # noqa: E501
        :type end_hour: float
        :param id: The id of this AccessSchedule.  # noqa: E501
        :type id: int
        :param start_hour: The start_hour of this AccessSchedule.  # noqa: E501
        :type start_hour: float
        :param user_id: The user_id of this AccessSchedule.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'day_of_week': DynamicDayOfWeek,
            'end_hour': float,
            'id': int,
            'start_hour': float,
            'user_id': str
        }

        self.attribute_map = {
            'day_of_week': 'DayOfWeek',
            'end_hour': 'EndHour',
            'id': 'Id',
            'start_hour': 'StartHour',
            'user_id': 'UserId'
        }

        self._day_of_week = day_of_week
        self._end_hour = end_hour
        self._id = id
        self._start_hour = start_hour
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'AccessSchedule':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AccessSchedule of this AccessSchedule.  # noqa: E501
        :rtype: AccessSchedule
        """
        return util.deserialize_model(dikt, cls)

    @property
    def day_of_week(self) -> DynamicDayOfWeek:
        """Gets the day_of_week of this AccessSchedule.


        :return: The day_of_week of this AccessSchedule.
        :rtype: DynamicDayOfWeek
        """
        return self._day_of_week

    @day_of_week.setter
    def day_of_week(self, day_of_week: DynamicDayOfWeek):
        """Sets the day_of_week of this AccessSchedule.


        :param day_of_week: The day_of_week of this AccessSchedule.
        :type day_of_week: DynamicDayOfWeek
        """
        if day_of_week is None:
            raise ValueError("Invalid value for `day_of_week`, must not be `None`")  # noqa: E501

        self._day_of_week = day_of_week

    @property
    def end_hour(self) -> float:
        """Gets the end_hour of this AccessSchedule.

        Gets or sets the end hour.  # noqa: E501

        :return: The end_hour of this AccessSchedule.
        :rtype: float
        """
        return self._end_hour

    @end_hour.setter
    def end_hour(self, end_hour: float):
        """Sets the end_hour of this AccessSchedule.

        Gets or sets the end hour.  # noqa: E501

        :param end_hour: The end_hour of this AccessSchedule.
        :type end_hour: float
        """
        if end_hour is None:
            raise ValueError("Invalid value for `end_hour`, must not be `None`")  # noqa: E501

        self._end_hour = end_hour

    @property
    def id(self) -> int:
        """Gets the id of this AccessSchedule.

        Gets or sets the id of this instance.  # noqa: E501

        :return: The id of this AccessSchedule.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this AccessSchedule.

        Gets or sets the id of this instance.  # noqa: E501

        :param id: The id of this AccessSchedule.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def start_hour(self) -> float:
        """Gets the start_hour of this AccessSchedule.

        Gets or sets the start hour.  # noqa: E501

        :return: The start_hour of this AccessSchedule.
        :rtype: float
        """
        return self._start_hour

    @start_hour.setter
    def start_hour(self, start_hour: float):
        """Sets the start_hour of this AccessSchedule.

        Gets or sets the start hour.  # noqa: E501

        :param start_hour: The start_hour of this AccessSchedule.
        :type start_hour: float
        """
        if start_hour is None:
            raise ValueError("Invalid value for `start_hour`, must not be `None`")  # noqa: E501

        self._start_hour = start_hour

    @property
    def user_id(self) -> str:
        """Gets the user_id of this AccessSchedule.

        Gets or sets the id of the associated user.  # noqa: E501

        :return: The user_id of this AccessSchedule.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this AccessSchedule.

        Gets or sets the id of the associated user.  # noqa: E501

        :param user_id: The user_id of this AccessSchedule.
        :type user_id: str
        """
        if user_id is None:
            raise ValueError("Invalid value for `user_id`, must not be `None`")  # noqa: E501

        self._user_id = user_id