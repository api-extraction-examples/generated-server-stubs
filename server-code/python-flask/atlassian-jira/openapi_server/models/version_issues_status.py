from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class VersionIssuesStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, done=None, in_progress=None, to_do=None, unmapped=None):  # noqa: E501
        """VersionIssuesStatus - a model defined in OpenAPI

        :param done: The done of this VersionIssuesStatus.  # noqa: E501
        :type done: int
        :param in_progress: The in_progress of this VersionIssuesStatus.  # noqa: E501
        :type in_progress: int
        :param to_do: The to_do of this VersionIssuesStatus.  # noqa: E501
        :type to_do: int
        :param unmapped: The unmapped of this VersionIssuesStatus.  # noqa: E501
        :type unmapped: int
        """
        self.openapi_types = {
            'done': int,
            'in_progress': int,
            'to_do': int,
            'unmapped': int
        }

        self.attribute_map = {
            'done': 'done',
            'in_progress': 'inProgress',
            'to_do': 'toDo',
            'unmapped': 'unmapped'
        }

        self._done = done
        self._in_progress = in_progress
        self._to_do = to_do
        self._unmapped = unmapped

    @classmethod
    def from_dict(cls, dikt) -> 'VersionIssuesStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VersionIssuesStatus of this VersionIssuesStatus.  # noqa: E501
        :rtype: VersionIssuesStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def done(self) -> int:
        """Gets the done of this VersionIssuesStatus.

        Count of issues with status *done*.  # noqa: E501

        :return: The done of this VersionIssuesStatus.
        :rtype: int
        """
        return self._done

    @done.setter
    def done(self, done: int):
        """Sets the done of this VersionIssuesStatus.

        Count of issues with status *done*.  # noqa: E501

        :param done: The done of this VersionIssuesStatus.
        :type done: int
        """

        self._done = done

    @property
    def in_progress(self) -> int:
        """Gets the in_progress of this VersionIssuesStatus.

        Count of issues with status *in progress*.  # noqa: E501

        :return: The in_progress of this VersionIssuesStatus.
        :rtype: int
        """
        return self._in_progress

    @in_progress.setter
    def in_progress(self, in_progress: int):
        """Sets the in_progress of this VersionIssuesStatus.

        Count of issues with status *in progress*.  # noqa: E501

        :param in_progress: The in_progress of this VersionIssuesStatus.
        :type in_progress: int
        """

        self._in_progress = in_progress

    @property
    def to_do(self) -> int:
        """Gets the to_do of this VersionIssuesStatus.

        Count of issues with status *to do*.  # noqa: E501

        :return: The to_do of this VersionIssuesStatus.
        :rtype: int
        """
        return self._to_do

    @to_do.setter
    def to_do(self, to_do: int):
        """Sets the to_do of this VersionIssuesStatus.

        Count of issues with status *to do*.  # noqa: E501

        :param to_do: The to_do of this VersionIssuesStatus.
        :type to_do: int
        """

        self._to_do = to_do

    @property
    def unmapped(self) -> int:
        """Gets the unmapped of this VersionIssuesStatus.

        Count of issues with a status other than *to do*, *in progress*, and *done*.  # noqa: E501

        :return: The unmapped of this VersionIssuesStatus.
        :rtype: int
        """
        return self._unmapped

    @unmapped.setter
    def unmapped(self, unmapped: int):
        """Sets the unmapped of this VersionIssuesStatus.

        Count of issues with a status other than *to do*, *in progress*, and *done*.  # noqa: E501

        :param unmapped: The unmapped of this VersionIssuesStatus.
        :type unmapped: int
        """

        self._unmapped = unmapped