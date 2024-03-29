from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.cron_expression import CronExpression
from openapi_server.models.relative_delta import RelativeDelta
from openapi_server.models.time_delta import TimeDelta
from openapi_server import util

from openapi_server.models.cron_expression import CronExpression  # noqa: E501
from openapi_server.models.relative_delta import RelativeDelta  # noqa: E501
from openapi_server.models.time_delta import TimeDelta  # noqa: E501

class ScheduleInterval(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, days=None, microseconds=None, seconds=None, day=None, hour=None, hours=None, leapdays=None, microsecond=None, minute=None, minutes=None, month=None, months=None, second=None, year=None, years=None, value=None):  # noqa: E501
        """ScheduleInterval - a model defined in OpenAPI

        :param type: The type of this ScheduleInterval.  # noqa: E501
        :type type: str
        :param days: The days of this ScheduleInterval.  # noqa: E501
        :type days: int
        :param microseconds: The microseconds of this ScheduleInterval.  # noqa: E501
        :type microseconds: int
        :param seconds: The seconds of this ScheduleInterval.  # noqa: E501
        :type seconds: int
        :param day: The day of this ScheduleInterval.  # noqa: E501
        :type day: int
        :param hour: The hour of this ScheduleInterval.  # noqa: E501
        :type hour: int
        :param hours: The hours of this ScheduleInterval.  # noqa: E501
        :type hours: int
        :param leapdays: The leapdays of this ScheduleInterval.  # noqa: E501
        :type leapdays: int
        :param microsecond: The microsecond of this ScheduleInterval.  # noqa: E501
        :type microsecond: int
        :param minute: The minute of this ScheduleInterval.  # noqa: E501
        :type minute: int
        :param minutes: The minutes of this ScheduleInterval.  # noqa: E501
        :type minutes: int
        :param month: The month of this ScheduleInterval.  # noqa: E501
        :type month: int
        :param months: The months of this ScheduleInterval.  # noqa: E501
        :type months: int
        :param second: The second of this ScheduleInterval.  # noqa: E501
        :type second: int
        :param year: The year of this ScheduleInterval.  # noqa: E501
        :type year: int
        :param years: The years of this ScheduleInterval.  # noqa: E501
        :type years: int
        :param value: The value of this ScheduleInterval.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'type': str,
            'days': int,
            'microseconds': int,
            'seconds': int,
            'day': int,
            'hour': int,
            'hours': int,
            'leapdays': int,
            'microsecond': int,
            'minute': int,
            'minutes': int,
            'month': int,
            'months': int,
            'second': int,
            'year': int,
            'years': int,
            'value': str
        }

        self.attribute_map = {
            'type': '__type',
            'days': 'days',
            'microseconds': 'microseconds',
            'seconds': 'seconds',
            'day': 'day',
            'hour': 'hour',
            'hours': 'hours',
            'leapdays': 'leapdays',
            'microsecond': 'microsecond',
            'minute': 'minute',
            'minutes': 'minutes',
            'month': 'month',
            'months': 'months',
            'second': 'second',
            'year': 'year',
            'years': 'years',
            'value': 'value'
        }

        self._type = type
        self._days = days
        self._microseconds = microseconds
        self._seconds = seconds
        self._day = day
        self._hour = hour
        self._hours = hours
        self._leapdays = leapdays
        self._microsecond = microsecond
        self._minute = minute
        self._minutes = minutes
        self._month = month
        self._months = months
        self._second = second
        self._year = year
        self._years = years
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'ScheduleInterval':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ScheduleInterval of this ScheduleInterval.  # noqa: E501
        :rtype: ScheduleInterval
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this ScheduleInterval.


        :return: The type of this ScheduleInterval.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this ScheduleInterval.


        :param type: The type of this ScheduleInterval.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def days(self) -> int:
        """Gets the days of this ScheduleInterval.


        :return: The days of this ScheduleInterval.
        :rtype: int
        """
        return self._days

    @days.setter
    def days(self, days: int):
        """Sets the days of this ScheduleInterval.


        :param days: The days of this ScheduleInterval.
        :type days: int
        """
        if days is None:
            raise ValueError("Invalid value for `days`, must not be `None`")  # noqa: E501

        self._days = days

    @property
    def microseconds(self) -> int:
        """Gets the microseconds of this ScheduleInterval.


        :return: The microseconds of this ScheduleInterval.
        :rtype: int
        """
        return self._microseconds

    @microseconds.setter
    def microseconds(self, microseconds: int):
        """Sets the microseconds of this ScheduleInterval.


        :param microseconds: The microseconds of this ScheduleInterval.
        :type microseconds: int
        """
        if microseconds is None:
            raise ValueError("Invalid value for `microseconds`, must not be `None`")  # noqa: E501

        self._microseconds = microseconds

    @property
    def seconds(self) -> int:
        """Gets the seconds of this ScheduleInterval.


        :return: The seconds of this ScheduleInterval.
        :rtype: int
        """
        return self._seconds

    @seconds.setter
    def seconds(self, seconds: int):
        """Sets the seconds of this ScheduleInterval.


        :param seconds: The seconds of this ScheduleInterval.
        :type seconds: int
        """
        if seconds is None:
            raise ValueError("Invalid value for `seconds`, must not be `None`")  # noqa: E501

        self._seconds = seconds

    @property
    def day(self) -> int:
        """Gets the day of this ScheduleInterval.


        :return: The day of this ScheduleInterval.
        :rtype: int
        """
        return self._day

    @day.setter
    def day(self, day: int):
        """Sets the day of this ScheduleInterval.


        :param day: The day of this ScheduleInterval.
        :type day: int
        """
        if day is None:
            raise ValueError("Invalid value for `day`, must not be `None`")  # noqa: E501

        self._day = day

    @property
    def hour(self) -> int:
        """Gets the hour of this ScheduleInterval.


        :return: The hour of this ScheduleInterval.
        :rtype: int
        """
        return self._hour

    @hour.setter
    def hour(self, hour: int):
        """Sets the hour of this ScheduleInterval.


        :param hour: The hour of this ScheduleInterval.
        :type hour: int
        """
        if hour is None:
            raise ValueError("Invalid value for `hour`, must not be `None`")  # noqa: E501

        self._hour = hour

    @property
    def hours(self) -> int:
        """Gets the hours of this ScheduleInterval.


        :return: The hours of this ScheduleInterval.
        :rtype: int
        """
        return self._hours

    @hours.setter
    def hours(self, hours: int):
        """Sets the hours of this ScheduleInterval.


        :param hours: The hours of this ScheduleInterval.
        :type hours: int
        """
        if hours is None:
            raise ValueError("Invalid value for `hours`, must not be `None`")  # noqa: E501

        self._hours = hours

    @property
    def leapdays(self) -> int:
        """Gets the leapdays of this ScheduleInterval.


        :return: The leapdays of this ScheduleInterval.
        :rtype: int
        """
        return self._leapdays

    @leapdays.setter
    def leapdays(self, leapdays: int):
        """Sets the leapdays of this ScheduleInterval.


        :param leapdays: The leapdays of this ScheduleInterval.
        :type leapdays: int
        """
        if leapdays is None:
            raise ValueError("Invalid value for `leapdays`, must not be `None`")  # noqa: E501

        self._leapdays = leapdays

    @property
    def microsecond(self) -> int:
        """Gets the microsecond of this ScheduleInterval.


        :return: The microsecond of this ScheduleInterval.
        :rtype: int
        """
        return self._microsecond

    @microsecond.setter
    def microsecond(self, microsecond: int):
        """Sets the microsecond of this ScheduleInterval.


        :param microsecond: The microsecond of this ScheduleInterval.
        :type microsecond: int
        """
        if microsecond is None:
            raise ValueError("Invalid value for `microsecond`, must not be `None`")  # noqa: E501

        self._microsecond = microsecond

    @property
    def minute(self) -> int:
        """Gets the minute of this ScheduleInterval.


        :return: The minute of this ScheduleInterval.
        :rtype: int
        """
        return self._minute

    @minute.setter
    def minute(self, minute: int):
        """Sets the minute of this ScheduleInterval.


        :param minute: The minute of this ScheduleInterval.
        :type minute: int
        """
        if minute is None:
            raise ValueError("Invalid value for `minute`, must not be `None`")  # noqa: E501

        self._minute = minute

    @property
    def minutes(self) -> int:
        """Gets the minutes of this ScheduleInterval.


        :return: The minutes of this ScheduleInterval.
        :rtype: int
        """
        return self._minutes

    @minutes.setter
    def minutes(self, minutes: int):
        """Sets the minutes of this ScheduleInterval.


        :param minutes: The minutes of this ScheduleInterval.
        :type minutes: int
        """
        if minutes is None:
            raise ValueError("Invalid value for `minutes`, must not be `None`")  # noqa: E501

        self._minutes = minutes

    @property
    def month(self) -> int:
        """Gets the month of this ScheduleInterval.


        :return: The month of this ScheduleInterval.
        :rtype: int
        """
        return self._month

    @month.setter
    def month(self, month: int):
        """Sets the month of this ScheduleInterval.


        :param month: The month of this ScheduleInterval.
        :type month: int
        """
        if month is None:
            raise ValueError("Invalid value for `month`, must not be `None`")  # noqa: E501

        self._month = month

    @property
    def months(self) -> int:
        """Gets the months of this ScheduleInterval.


        :return: The months of this ScheduleInterval.
        :rtype: int
        """
        return self._months

    @months.setter
    def months(self, months: int):
        """Sets the months of this ScheduleInterval.


        :param months: The months of this ScheduleInterval.
        :type months: int
        """
        if months is None:
            raise ValueError("Invalid value for `months`, must not be `None`")  # noqa: E501

        self._months = months

    @property
    def second(self) -> int:
        """Gets the second of this ScheduleInterval.


        :return: The second of this ScheduleInterval.
        :rtype: int
        """
        return self._second

    @second.setter
    def second(self, second: int):
        """Sets the second of this ScheduleInterval.


        :param second: The second of this ScheduleInterval.
        :type second: int
        """
        if second is None:
            raise ValueError("Invalid value for `second`, must not be `None`")  # noqa: E501

        self._second = second

    @property
    def year(self) -> int:
        """Gets the year of this ScheduleInterval.


        :return: The year of this ScheduleInterval.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year: int):
        """Sets the year of this ScheduleInterval.


        :param year: The year of this ScheduleInterval.
        :type year: int
        """
        if year is None:
            raise ValueError("Invalid value for `year`, must not be `None`")  # noqa: E501

        self._year = year

    @property
    def years(self) -> int:
        """Gets the years of this ScheduleInterval.


        :return: The years of this ScheduleInterval.
        :rtype: int
        """
        return self._years

    @years.setter
    def years(self, years: int):
        """Sets the years of this ScheduleInterval.


        :param years: The years of this ScheduleInterval.
        :type years: int
        """
        if years is None:
            raise ValueError("Invalid value for `years`, must not be `None`")  # noqa: E501

        self._years = years

    @property
    def value(self) -> str:
        """Gets the value of this ScheduleInterval.


        :return: The value of this ScheduleInterval.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this ScheduleInterval.


        :param value: The value of this ScheduleInterval.
        :type value: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value
