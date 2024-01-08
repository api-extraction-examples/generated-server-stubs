import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.task_info import TaskInfo  # noqa: E501
from openapi_server.models.task_trigger_info import TaskTriggerInfo  # noqa: E501
from openapi_server import util


def get_task(task_id):  # noqa: E501
    """Get task by id.

     # noqa: E501

    :param task_id: Task Id.
    :type task_id: str

    :rtype: Union[TaskInfo, Tuple[TaskInfo, int], Tuple[TaskInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tasks(is_hidden=None, is_enabled=None):  # noqa: E501
    """Get tasks.

     # noqa: E501

    :param is_hidden: Optional filter tasks that are hidden, or not.
    :type is_hidden: bool
    :param is_enabled: Optional filter tasks that are enabled, or not.
    :type is_enabled: bool

    :rtype: Union[List[TaskInfo], Tuple[List[TaskInfo], int], Tuple[List[TaskInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def start_task(task_id):  # noqa: E501
    """Start specified task.

     # noqa: E501

    :param task_id: Task Id.
    :type task_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def stop_task(task_id):  # noqa: E501
    """Stop specified task.

     # noqa: E501

    :param task_id: Task Id.
    :type task_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_task(task_id, task_trigger_info):  # noqa: E501
    """Update specified task triggers.

     # noqa: E501

    :param task_id: Task Id.
    :type task_id: str
    :param task_trigger_info: Triggers.
    :type task_trigger_info: list | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        task_trigger_info = [TaskTriggerInfo.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
