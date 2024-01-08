import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.clear_task_instances import ClearTaskInstances  # noqa: E501
from openapi_server.models.dag import DAG  # noqa: E501
from openapi_server.models.dag_collection import DAGCollection  # noqa: E501
from openapi_server.models.dag_detail import DAGDetail  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.get_dag_source200_response import GetDagSource200Response  # noqa: E501
from openapi_server.models.task import Task  # noqa: E501
from openapi_server.models.task_collection import TaskCollection  # noqa: E501
from openapi_server.models.task_instance_reference_collection import TaskInstanceReferenceCollection  # noqa: E501
from openapi_server.models.update_task_instances_state import UpdateTaskInstancesState  # noqa: E501
from openapi_server import util


def delete_dag(dag_id):  # noqa: E501
    """Delete a DAG

    Deletes all metadata related to the DAG, including finished DAG Runs and Tasks. Logs are not deleted. This action cannot be undone.  *New in version 2.2.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dag(dag_id):  # noqa: E501
    """Get basic information about a DAG

    Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/details.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str

    :rtype: Union[DAG, Tuple[DAG, int], Tuple[DAG, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dag_details(dag_id):  # noqa: E501
    """Get a simplified representation of DAG

    The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str

    :rtype: Union[DAGDetail, Tuple[DAGDetail, int], Tuple[DAGDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dag_source(file_token):  # noqa: E501
    """Get a source code

    Get a source code using file token.  # noqa: E501

    :param file_token: The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
    :type file_token: str

    :rtype: Union[GetDagSource200Response, Tuple[GetDagSource200Response, int], Tuple[GetDagSource200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dags(limit=None, offset=None, order_by=None, tags=None, only_active=None, dag_id_pattern=None):  # noqa: E501
    """List DAGs

    List DAGs in the database. &#x60;dag_id_pattern&#x60; can be set to match dags of a specific pattern  # noqa: E501

    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str
    :param tags: List of tags to filter results.  *New in version 2.2.0* 
    :type tags: List[str]
    :param only_active: Only filter active DAGs.  *New in version 2.1.1* 
    :type only_active: bool
    :param dag_id_pattern: If set, only return DAGs with dag_ids matching this pattern. 
    :type dag_id_pattern: str

    :rtype: Union[DAGCollection, Tuple[DAGCollection, int], Tuple[DAGCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_task(dag_id, task_id):  # noqa: E501
    """Get simplified representation of a task

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param task_id: The task ID.
    :type task_id: str

    :rtype: Union[Task, Tuple[Task, int], Tuple[Task, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_tasks(dag_id, order_by=None):  # noqa: E501
    """Get tasks for DAG

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[TaskCollection, Tuple[TaskCollection, int], Tuple[TaskCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_dag(dag_id, dag, update_mask=None):  # noqa: E501
    """Update a DAG

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag: 
    :type dag: dict | bytes
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]

    :rtype: Union[DAG, Tuple[DAG, int], Tuple[DAG, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dag = DAG.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def patch_dags(dag_id_pattern, dag, limit=None, offset=None, tags=None, update_mask=None, only_active=None):  # noqa: E501
    """Update DAGs

    Update DAGs of a given dag_id_pattern using UpdateMask. This endpoint allows specifying &#x60;~&#x60; as the dag_id_pattern to update all DAGs. *New in version 2.3.0*  # noqa: E501

    :param dag_id_pattern: If set, only update DAGs with dag_ids matching this pattern. 
    :type dag_id_pattern: str
    :param dag: 
    :type dag: dict | bytes
    :param limit: The numbers of items to return.
    :type limit: int
    :param offset: The number of items to skip before starting to collect the result set.
    :type offset: int
    :param tags: List of tags to filter results.  *New in version 2.2.0* 
    :type tags: List[str]
    :param update_mask: The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. 
    :type update_mask: List[str]
    :param only_active: Only filter active DAGs.  *New in version 2.1.1* 
    :type only_active: bool

    :rtype: Union[DAGCollection, Tuple[DAGCollection, int], Tuple[DAGCollection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dag = DAG.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_clear_task_instances(dag_id, clear_task_instances):  # noqa: E501
    """Clear a set of task instances

    Clears a set of task instances associated with the DAG for a specified date range.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param clear_task_instances: Parameters of action
    :type clear_task_instances: dict | bytes

    :rtype: Union[TaskInstanceReferenceCollection, Tuple[TaskInstanceReferenceCollection, int], Tuple[TaskInstanceReferenceCollection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        clear_task_instances = ClearTaskInstances.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_set_task_instances_state(dag_id, update_task_instances_state):  # noqa: E501
    """Set a state of task instances

    Updates the state for multiple task instances simultaneously.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param update_task_instances_state: Parameters of action
    :type update_task_instances_state: dict | bytes

    :rtype: Union[TaskInstanceReferenceCollection, Tuple[TaskInstanceReferenceCollection, int], Tuple[TaskInstanceReferenceCollection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_task_instances_state = UpdateTaskInstancesState.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
