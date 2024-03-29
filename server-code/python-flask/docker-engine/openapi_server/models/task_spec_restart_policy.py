from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskSpecRestartPolicy(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, condition=None, delay=None, max_attempts=0, window=0):  # noqa: E501
        """TaskSpecRestartPolicy - a model defined in OpenAPI

        :param condition: The condition of this TaskSpecRestartPolicy.  # noqa: E501
        :type condition: str
        :param delay: The delay of this TaskSpecRestartPolicy.  # noqa: E501
        :type delay: int
        :param max_attempts: The max_attempts of this TaskSpecRestartPolicy.  # noqa: E501
        :type max_attempts: int
        :param window: The window of this TaskSpecRestartPolicy.  # noqa: E501
        :type window: int
        """
        self.openapi_types = {
            'condition': str,
            'delay': int,
            'max_attempts': int,
            'window': int
        }

        self.attribute_map = {
            'condition': 'Condition',
            'delay': 'Delay',
            'max_attempts': 'MaxAttempts',
            'window': 'Window'
        }

        self._condition = condition
        self._delay = delay
        self._max_attempts = max_attempts
        self._window = window

    @classmethod
    def from_dict(cls, dikt) -> 'TaskSpecRestartPolicy':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskSpec_RestartPolicy of this TaskSpecRestartPolicy.  # noqa: E501
        :rtype: TaskSpecRestartPolicy
        """
        return util.deserialize_model(dikt, cls)

    @property
    def condition(self) -> str:
        """Gets the condition of this TaskSpecRestartPolicy.

        Condition for restart.  # noqa: E501

        :return: The condition of this TaskSpecRestartPolicy.
        :rtype: str
        """
        return self._condition

    @condition.setter
    def condition(self, condition: str):
        """Sets the condition of this TaskSpecRestartPolicy.

        Condition for restart.  # noqa: E501

        :param condition: The condition of this TaskSpecRestartPolicy.
        :type condition: str
        """
        allowed_values = ["none", "on-failure", "any"]  # noqa: E501
        if condition not in allowed_values:
            raise ValueError(
                "Invalid value for `condition` ({0}), must be one of {1}"
                .format(condition, allowed_values)
            )

        self._condition = condition

    @property
    def delay(self) -> int:
        """Gets the delay of this TaskSpecRestartPolicy.

        Delay between restart attempts.  # noqa: E501

        :return: The delay of this TaskSpecRestartPolicy.
        :rtype: int
        """
        return self._delay

    @delay.setter
    def delay(self, delay: int):
        """Sets the delay of this TaskSpecRestartPolicy.

        Delay between restart attempts.  # noqa: E501

        :param delay: The delay of this TaskSpecRestartPolicy.
        :type delay: int
        """

        self._delay = delay

    @property
    def max_attempts(self) -> int:
        """Gets the max_attempts of this TaskSpecRestartPolicy.

        Maximum attempts to restart a given container before giving up (default value is 0, which is ignored).  # noqa: E501

        :return: The max_attempts of this TaskSpecRestartPolicy.
        :rtype: int
        """
        return self._max_attempts

    @max_attempts.setter
    def max_attempts(self, max_attempts: int):
        """Sets the max_attempts of this TaskSpecRestartPolicy.

        Maximum attempts to restart a given container before giving up (default value is 0, which is ignored).  # noqa: E501

        :param max_attempts: The max_attempts of this TaskSpecRestartPolicy.
        :type max_attempts: int
        """

        self._max_attempts = max_attempts

    @property
    def window(self) -> int:
        """Gets the window of this TaskSpecRestartPolicy.

        Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded).  # noqa: E501

        :return: The window of this TaskSpecRestartPolicy.
        :rtype: int
        """
        return self._window

    @window.setter
    def window(self, window: int):
        """Sets the window of this TaskSpecRestartPolicy.

        Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded).  # noqa: E501

        :param window: The window of this TaskSpecRestartPolicy.
        :type window: int
        """

        self._window = window
