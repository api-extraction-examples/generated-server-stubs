from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StoryResponseAllOfNewDateValue(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, due_at=None, due_on=None, start_on=None):  # noqa: E501
        """StoryResponseAllOfNewDateValue - a model defined in OpenAPI

        :param due_at: The due_at of this StoryResponseAllOfNewDateValue.  # noqa: E501
        :type due_at: datetime
        :param due_on: The due_on of this StoryResponseAllOfNewDateValue.  # noqa: E501
        :type due_on: date
        :param start_on: The start_on of this StoryResponseAllOfNewDateValue.  # noqa: E501
        :type start_on: date
        """
        self.openapi_types = {
            'due_at': datetime,
            'due_on': date,
            'start_on': date
        }

        self.attribute_map = {
            'due_at': 'due_at',
            'due_on': 'due_on',
            'start_on': 'start_on'
        }

        self._due_at = due_at
        self._due_on = due_on
        self._start_on = start_on

    @classmethod
    def from_dict(cls, dikt) -> 'StoryResponseAllOfNewDateValue':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StoryResponse_allOf_new_date_value of this StoryResponseAllOfNewDateValue.  # noqa: E501
        :rtype: StoryResponseAllOfNewDateValue
        """
        return util.deserialize_model(dikt, cls)

    @property
    def due_at(self) -> datetime:
        """Gets the due_at of this StoryResponseAllOfNewDateValue.

        The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.  # noqa: E501

        :return: The due_at of this StoryResponseAllOfNewDateValue.
        :rtype: datetime
        """
        return self._due_at

    @due_at.setter
    def due_at(self, due_at: datetime):
        """Sets the due_at of this StoryResponseAllOfNewDateValue.

        The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.  # noqa: E501

        :param due_at: The due_at of this StoryResponseAllOfNewDateValue.
        :type due_at: datetime
        """

        self._due_at = due_at

    @property
    def due_on(self) -> date:
        """Gets the due_on of this StoryResponseAllOfNewDateValue.

        The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.  # noqa: E501

        :return: The due_on of this StoryResponseAllOfNewDateValue.
        :rtype: date
        """
        return self._due_on

    @due_on.setter
    def due_on(self, due_on: date):
        """Sets the due_on of this StoryResponseAllOfNewDateValue.

        The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.  # noqa: E501

        :param due_on: The due_on of this StoryResponseAllOfNewDateValue.
        :type due_on: date
        """

        self._due_on = due_on

    @property
    def start_on(self) -> date:
        """Gets the start_on of this StoryResponseAllOfNewDateValue.

        The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.  # noqa: E501

        :return: The start_on of this StoryResponseAllOfNewDateValue.
        :rtype: date
        """
        return self._start_on

    @start_on.setter
    def start_on(self, start_on: date):
        """Sets the start_on of this StoryResponseAllOfNewDateValue.

        The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.  # noqa: E501

        :param start_on: The start_on of this StoryResponseAllOfNewDateValue.
        :type start_on: date
        """

        self._start_on = start_on