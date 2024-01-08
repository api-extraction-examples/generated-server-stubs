import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server import util


def cancel_task(task_id):  # noqa: E501
    """Cancel task

    Cancels a task.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task. # noqa: E501

    :param task_id: The ID of the task.
    :type task_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_task(task_id):  # noqa: E501
    """Get task

    Returns the status of a [long-running asynchronous task](#async).  When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task. # noqa: E501

    :param task_id: The ID of the task.
    :type task_id: str

    :rtype: Union[TaskProgressBeanObject, Tuple[TaskProgressBeanObject, int], Tuple[TaskProgressBeanObject, int, Dict[str, str]]
    """
    return 'do some magic!'
