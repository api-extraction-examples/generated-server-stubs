import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.extra_link_collection import ExtraLinkCollection  # noqa: E501
from openapi_server.models.get_log200_response import GetLog200Response  # noqa: E501
from openapi_server.models.list_task_instance_form import ListTaskInstanceForm  # noqa: E501
from openapi_server.models.set_task_instance_note import SetTaskInstanceNote  # noqa: E501
from openapi_server.models.task_instance import TaskInstance  # noqa: E501
from openapi_server.models.task_instance_collection import TaskInstanceCollection  # noqa: E501
from openapi_server.models.task_instance_reference import TaskInstanceReference  # noqa: E501
from openapi_server.models.update_task_instance import UpdateTaskInstance  # noqa: E501
from openapi_server import util


def get_extra_links(dag_id, dag_run_id, task_id):  # noqa: E501
    """List extra links

    List extra links for task instance.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str

    :rtype: Union[ExtraLinkCollection, Tuple[ExtraLinkCollection, int], Tuple[ExtraLinkCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_log(dag_id, dag_run_id, task_id, task_try_number, full_content=None, map_index=None, token=None):  # noqa: E501
    """Get logs

    Get logs for a specific task instance and its try number. # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param task_try_number: The task try number.
    :type task_try_number: int
    :param full_content: A full content will be returned. By default, only the first fragment will be returned. 
    :type full_content: bool
    :param map_index: Filter on map index for mapped task.
    :type map_index: int
    :param token: A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued. 
    :type token: str

    :rtype: Union[GetLog200Response, Tuple[GetLog200Response, int], Tuple[GetLog200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_mapped_task_instance(dag_id, dag_run_id, task_id, map_index):  # noqa: E501
    """Get a mapped task instance

    Get details of a mapped task instance.  *New in version 2.3.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param map_index: The map index.
    :type map_index: int

    :rtype: Union[TaskInstance, Tuple[TaskInstance, int], Tuple[TaskInstance, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_mapped_task_instances(dag_id, dag_run_id, task_id, limit=None, offset=None, execution_date_gte=None, execution_date_lte=None, start_date_gte=None, start_date_lte=None, end_date_gte=None, end_date_lte=None, duration_gte=None, duration_lte=None, state=None, pool=None, queue=None, order_by=None):  # noqa: E501
    """List mapped task instances

    Get details of all mapped task instances.  *New in version 2.3.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param execution_date_gte: Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period. 
    :type execution_date_gte: str
    :param execution_date_lte: Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period. 
    :type execution_date_lte: str
    :param start_date_gte: Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. 
    :type start_date_gte: str
    :param start_date_lte: Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. 
    :type start_date_lte: str
    :param end_date_gte: Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. 
    :type end_date_gte: str
    :param end_date_lte: Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. 
    :type end_date_lte: str
    :param duration_gte: Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period. 
    :type duration_gte: 
    :param duration_lte: Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range. 
    :type duration_lte: 
    :param state: The value can be repeated to retrieve multiple matching values (OR condition).
    :type state: List[str]
    :param pool: The value can be repeated to retrieve multiple matching values (OR condition).
    :type pool: List[str]
    :param queue: The value can be repeated to retrieve multiple matching values (OR condition).
    :type queue: List[str]
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[TaskInstanceCollection, Tuple[TaskInstanceCollection, int], Tuple[TaskInstanceCollection, int, Dict[str, str]]
    """
    execution_date_gte = util.deserialize_datetime(execution_date_gte)
    execution_date_lte = util.deserialize_datetime(execution_date_lte)
    start_date_gte = util.deserialize_datetime(start_date_gte)
    start_date_lte = util.deserialize_datetime(start_date_lte)
    end_date_gte = util.deserialize_datetime(end_date_gte)
    end_date_lte = util.deserialize_datetime(end_date_lte)
    return 'do some magic!'


def get_task_instance(dag_id, dag_run_id, task_id):  # noqa: E501
    """Get a task instance

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str

    :rtype: Union[TaskInstance, Tuple[TaskInstance, int], Tuple[TaskInstance, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_task_instances(dag_id, dag_run_id, execution_date_gte=None, execution_date_lte=None, start_date_gte=None, start_date_lte=None, end_date_gte=None, end_date_lte=None, duration_gte=None, duration_lte=None, state=None, pool=None, queue=None, limit=None, offset=None):  # noqa: E501
    """List task instances

    This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG runs for all DAGs and DAG runs.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param execution_date_gte: Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period. 
    :type execution_date_gte: str
    :param execution_date_lte: Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period. 
    :type execution_date_lte: str
    :param start_date_gte: Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. 
    :type start_date_gte: str
    :param start_date_lte: Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. 
    :type start_date_lte: str
    :param end_date_gte: Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. 
    :type end_date_gte: str
    :param end_date_lte: Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. 
    :type end_date_lte: str
    :param duration_gte: Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period. 
    :type duration_gte: 
    :param duration_lte: Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range. 
    :type duration_lte: 
    :param state: The value can be repeated to retrieve multiple matching values (OR condition).
    :type state: List[str]
    :param pool: The value can be repeated to retrieve multiple matching values (OR condition).
    :type pool: List[str]
    :param queue: The value can be repeated to retrieve multiple matching values (OR condition).
    :type queue: List[str]
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int

    :rtype: Union[TaskInstanceCollection, Tuple[TaskInstanceCollection, int], Tuple[TaskInstanceCollection, int, Dict[str, str]]
    """
    execution_date_gte = util.deserialize_datetime(execution_date_gte)
    execution_date_lte = util.deserialize_datetime(execution_date_lte)
    start_date_gte = util.deserialize_datetime(start_date_gte)
    start_date_lte = util.deserialize_datetime(start_date_lte)
    end_date_gte = util.deserialize_datetime(end_date_gte)
    end_date_lte = util.deserialize_datetime(end_date_lte)
    return 'do some magic!'


def get_task_instances_batch(list_task_instance_form):  # noqa: E501
    """List task instances (batch)

    List task instances from all DAGs and DAG runs. This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL length limits.  # noqa: E501

    :param list_task_instance_form: 
    :type list_task_instance_form: dict | bytes

    :rtype: Union[TaskInstanceCollection, Tuple[TaskInstanceCollection, int], Tuple[TaskInstanceCollection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_task_instance_form = ListTaskInstanceForm.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def patch_mapped_task_instance(dag_id, dag_run_id, task_id, map_index, update_task_instance=None):  # noqa: E501
    """Updates the state of a mapped task instance

    Updates the state for single mapped task instance. *New in version 2.5.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param map_index: The map index.
    :type map_index: int
    :param update_task_instance: Parameters of action
    :type update_task_instance: dict | bytes

    :rtype: Union[TaskInstanceReference, Tuple[TaskInstanceReference, int], Tuple[TaskInstanceReference, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_task_instance = UpdateTaskInstance.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def patch_task_instance(dag_id, dag_run_id, task_id, update_task_instance):  # noqa: E501
    """Updates the state of a task instance

    Updates the state for single task instance. *New in version 2.5.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param update_task_instance: Parameters of action
    :type update_task_instance: dict | bytes

    :rtype: Union[TaskInstanceReference, Tuple[TaskInstanceReference, int], Tuple[TaskInstanceReference, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_task_instance = UpdateTaskInstance.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_mapped_task_instance_note(dag_id, dag_run_id, task_id, map_index, set_task_instance_note):  # noqa: E501
    """Update the TaskInstance note.

    Update the manual user note of a mapped Task Instance.  *New in version 2.5.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param map_index: The map index.
    :type map_index: int
    :param set_task_instance_note: Parameters of set Task Instance note.
    :type set_task_instance_note: dict | bytes

    :rtype: Union[TaskInstance, Tuple[TaskInstance, int], Tuple[TaskInstance, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_task_instance_note = SetTaskInstanceNote.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_task_instance_note(dag_id, dag_run_id, task_id, set_task_instance_note):  # noqa: E501
    """Update the TaskInstance note.

    Update the manual user note of a non-mapped Task Instance.  *New in version 2.5.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param task_id: The task ID.
    :type task_id: str
    :param set_task_instance_note: Parameters of set Task Instance note.
    :type set_task_instance_note: dict | bytes

    :rtype: Union[TaskInstance, Tuple[TaskInstance, int], Tuple[TaskInstance, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_task_instance_note = SetTaskInstanceNote.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
