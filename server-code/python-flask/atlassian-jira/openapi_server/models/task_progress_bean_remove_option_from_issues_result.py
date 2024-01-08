from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.remove_option_from_issues_result import RemoveOptionFromIssuesResult
from openapi_server import util

from openapi_server.models.remove_option_from_issues_result import RemoveOptionFromIssuesResult  # noqa: E501

class TaskProgressBeanRemoveOptionFromIssuesResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, elapsed_runtime=None, finished=None, id=None, last_update=None, message=None, progress=None, result=None, _self=None, started=None, status=None, submitted=None, submitted_by=None):  # noqa: E501
        """TaskProgressBeanRemoveOptionFromIssuesResult - a model defined in OpenAPI

        :param description: The description of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type description: str
        :param elapsed_runtime: The elapsed_runtime of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type elapsed_runtime: int
        :param finished: The finished of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type finished: int
        :param id: The id of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type id: str
        :param last_update: The last_update of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type last_update: int
        :param message: The message of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type message: str
        :param progress: The progress of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type progress: int
        :param result: The result of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type result: RemoveOptionFromIssuesResult
        :param _self: The _self of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type _self: str
        :param started: The started of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type started: int
        :param status: The status of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type status: str
        :param submitted: The submitted of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type submitted: int
        :param submitted_by: The submitted_by of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :type submitted_by: int
        """
        self.openapi_types = {
            'description': str,
            'elapsed_runtime': int,
            'finished': int,
            'id': str,
            'last_update': int,
            'message': str,
            'progress': int,
            'result': RemoveOptionFromIssuesResult,
            '_self': str,
            'started': int,
            'status': str,
            'submitted': int,
            'submitted_by': int
        }

        self.attribute_map = {
            'description': 'description',
            'elapsed_runtime': 'elapsedRuntime',
            'finished': 'finished',
            'id': 'id',
            'last_update': 'lastUpdate',
            'message': 'message',
            'progress': 'progress',
            'result': 'result',
            '_self': 'self',
            'started': 'started',
            'status': 'status',
            'submitted': 'submitted',
            'submitted_by': 'submittedBy'
        }

        self._description = description
        self._elapsed_runtime = elapsed_runtime
        self._finished = finished
        self._id = id
        self._last_update = last_update
        self._message = message
        self._progress = progress
        self._result = result
        self.__self = _self
        self._started = started
        self._status = status
        self._submitted = submitted
        self._submitted_by = submitted_by

    @classmethod
    def from_dict(cls, dikt) -> 'TaskProgressBeanRemoveOptionFromIssuesResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskProgressBeanRemoveOptionFromIssuesResult of this TaskProgressBeanRemoveOptionFromIssuesResult.  # noqa: E501
        :rtype: TaskProgressBeanRemoveOptionFromIssuesResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The description of the task.  # noqa: E501

        :return: The description of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The description of the task.  # noqa: E501

        :param description: The description of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type description: str
        """

        self._description = description

    @property
    def elapsed_runtime(self) -> int:
        """Gets the elapsed_runtime of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The execution time of the task, in milliseconds.  # noqa: E501

        :return: The elapsed_runtime of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._elapsed_runtime

    @elapsed_runtime.setter
    def elapsed_runtime(self, elapsed_runtime: int):
        """Sets the elapsed_runtime of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The execution time of the task, in milliseconds.  # noqa: E501

        :param elapsed_runtime: The elapsed_runtime of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type elapsed_runtime: int
        """
        if elapsed_runtime is None:
            raise ValueError("Invalid value for `elapsed_runtime`, must not be `None`")  # noqa: E501

        self._elapsed_runtime = elapsed_runtime

    @property
    def finished(self) -> int:
        """Gets the finished of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task was finished.  # noqa: E501

        :return: The finished of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._finished

    @finished.setter
    def finished(self, finished: int):
        """Sets the finished of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task was finished.  # noqa: E501

        :param finished: The finished of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type finished: int
        """

        self._finished = finished

    @property
    def id(self) -> str:
        """Gets the id of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The ID of the task.  # noqa: E501

        :return: The id of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The ID of the task.  # noqa: E501

        :param id: The id of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def last_update(self) -> int:
        """Gets the last_update of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task progress was last updated.  # noqa: E501

        :return: The last_update of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._last_update

    @last_update.setter
    def last_update(self, last_update: int):
        """Sets the last_update of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task progress was last updated.  # noqa: E501

        :param last_update: The last_update of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type last_update: int
        """
        if last_update is None:
            raise ValueError("Invalid value for `last_update`, must not be `None`")  # noqa: E501

        self._last_update = last_update

    @property
    def message(self) -> str:
        """Gets the message of this TaskProgressBeanRemoveOptionFromIssuesResult.

        Information about the progress of the task.  # noqa: E501

        :return: The message of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this TaskProgressBeanRemoveOptionFromIssuesResult.

        Information about the progress of the task.  # noqa: E501

        :param message: The message of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type message: str
        """

        self._message = message

    @property
    def progress(self) -> int:
        """Gets the progress of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The progress of the task, as a percentage complete.  # noqa: E501

        :return: The progress of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._progress

    @progress.setter
    def progress(self, progress: int):
        """Sets the progress of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The progress of the task, as a percentage complete.  # noqa: E501

        :param progress: The progress of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type progress: int
        """
        if progress is None:
            raise ValueError("Invalid value for `progress`, must not be `None`")  # noqa: E501

        self._progress = progress

    @property
    def result(self) -> RemoveOptionFromIssuesResult:
        """Gets the result of this TaskProgressBeanRemoveOptionFromIssuesResult.


        :return: The result of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: RemoveOptionFromIssuesResult
        """
        return self._result

    @result.setter
    def result(self, result: RemoveOptionFromIssuesResult):
        """Sets the result of this TaskProgressBeanRemoveOptionFromIssuesResult.


        :param result: The result of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type result: RemoveOptionFromIssuesResult
        """

        self._result = result

    @property
    def _self(self) -> str:
        """Gets the _self of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The URL of the task.  # noqa: E501

        :return: The _self of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The URL of the task.  # noqa: E501

        :param _self: The _self of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type _self: str
        """
        if _self is None:
            raise ValueError("Invalid value for `_self`, must not be `None`")  # noqa: E501

        self.__self = _self

    @property
    def started(self) -> int:
        """Gets the started of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task was started.  # noqa: E501

        :return: The started of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._started

    @started.setter
    def started(self, started: int):
        """Sets the started of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task was started.  # noqa: E501

        :param started: The started of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type started: int
        """

        self._started = started

    @property
    def status(self) -> str:
        """Gets the status of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The status of the task.  # noqa: E501

        :return: The status of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The status of the task.  # noqa: E501

        :param status: The status of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type status: str
        """
        allowed_values = ["ENQUEUED", "RUNNING", "COMPLETE", "FAILED", "CANCEL_REQUESTED", "CANCELLED", "DEAD"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def submitted(self) -> int:
        """Gets the submitted of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task was submitted.  # noqa: E501

        :return: The submitted of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._submitted

    @submitted.setter
    def submitted(self, submitted: int):
        """Sets the submitted of this TaskProgressBeanRemoveOptionFromIssuesResult.

        A timestamp recording when the task was submitted.  # noqa: E501

        :param submitted: The submitted of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type submitted: int
        """
        if submitted is None:
            raise ValueError("Invalid value for `submitted`, must not be `None`")  # noqa: E501

        self._submitted = submitted

    @property
    def submitted_by(self) -> int:
        """Gets the submitted_by of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The ID of the user who submitted the task.  # noqa: E501

        :return: The submitted_by of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :rtype: int
        """
        return self._submitted_by

    @submitted_by.setter
    def submitted_by(self, submitted_by: int):
        """Sets the submitted_by of this TaskProgressBeanRemoveOptionFromIssuesResult.

        The ID of the user who submitted the task.  # noqa: E501

        :param submitted_by: The submitted_by of this TaskProgressBeanRemoveOptionFromIssuesResult.
        :type submitted_by: int
        """
        if submitted_by is None:
            raise ValueError("Invalid value for `submitted_by`, must not be `None`")  # noqa: E501

        self._submitted_by = submitted_by
