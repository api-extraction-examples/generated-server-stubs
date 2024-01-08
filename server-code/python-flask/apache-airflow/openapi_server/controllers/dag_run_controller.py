import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.clear_dag_run import ClearDagRun  # noqa: E501
from openapi_server.models.clear_dag_run200_response import ClearDagRun200Response  # noqa: E501
from openapi_server.models.dag_run import DAGRun  # noqa: E501
from openapi_server.models.dag_run_collection import DAGRunCollection  # noqa: E501
from openapi_server.models.dataset_event_collection import DatasetEventCollection  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.list_dag_runs_form import ListDagRunsForm  # noqa: E501
from openapi_server.models.set_dag_run_note import SetDagRunNote  # noqa: E501
from openapi_server.models.update_dag_run_state import UpdateDagRunState  # noqa: E501
from openapi_server import util


def clear_dag_run(dag_id, dag_run_id, clear_dag_run):  # noqa: E501
    """Clear a DAG run

    Clear a DAG run.  *New in version 2.4.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param clear_dag_run: 
    :type clear_dag_run: dict | bytes

    :rtype: Union[ClearDagRun200Response, Tuple[ClearDagRun200Response, int], Tuple[ClearDagRun200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        clear_dag_run = ClearDagRun.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_dag_run(dag_id, dag_run_id):  # noqa: E501
    """Delete a DAG run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dag_run(dag_id, dag_run_id):  # noqa: E501
    """Get a DAG run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str

    :rtype: Union[DAGRun, Tuple[DAGRun, int], Tuple[DAGRun, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dag_runs(dag_id, limit=None, offset=None, execution_date_gte=None, execution_date_lte=None, start_date_gte=None, start_date_lte=None, end_date_gte=None, end_date_lte=None, state=None, order_by=None):  # noqa: E501
    """List DAG runs

    This endpoint allows specifying &#x60;~&#x60; as the dag_id to retrieve DAG runs for all DAGs.  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
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
    :param state: The value can be repeated to retrieve multiple matching values (OR condition).
    :type state: List[str]
    :param order_by: The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* 
    :type order_by: str

    :rtype: Union[DAGRunCollection, Tuple[DAGRunCollection, int], Tuple[DAGRunCollection, int, Dict[str, str]]
    """
    execution_date_gte = util.deserialize_datetime(execution_date_gte)
    execution_date_lte = util.deserialize_datetime(execution_date_lte)
    start_date_gte = util.deserialize_datetime(start_date_gte)
    start_date_lte = util.deserialize_datetime(start_date_lte)
    end_date_gte = util.deserialize_datetime(end_date_gte)
    end_date_lte = util.deserialize_datetime(end_date_lte)
    return 'do some magic!'


def get_dag_runs_batch(list_dag_runs_form):  # noqa: E501
    """List DAG runs (batch)

    This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL length limit.  # noqa: E501

    :param list_dag_runs_form: 
    :type list_dag_runs_form: dict | bytes

    :rtype: Union[DAGRunCollection, Tuple[DAGRunCollection, int], Tuple[DAGRunCollection, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        list_dag_runs_form = ListDagRunsForm.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_upstream_dataset_events(dag_id, dag_run_id):  # noqa: E501
    """Get dataset events for a DAG run

    Get datasets for a dag run.  *New in version 2.4.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str

    :rtype: Union[DatasetEventCollection, Tuple[DatasetEventCollection, int], Tuple[DatasetEventCollection, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_dag_run(dag_id, dag_run):  # noqa: E501
    """Trigger a new DAG run

     # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run: 
    :type dag_run: dict | bytes

    :rtype: Union[DAGRun, Tuple[DAGRun, int], Tuple[DAGRun, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dag_run = DAGRun.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_dag_run_note(dag_id, dag_run_id, set_dag_run_note):  # noqa: E501
    """Update the DagRun note.

    Update the manual user note of a DagRun.  *New in version 2.5.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param set_dag_run_note: Parameters of set DagRun note.
    :type set_dag_run_note: dict | bytes

    :rtype: Union[DAGRun, Tuple[DAGRun, int], Tuple[DAGRun, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_dag_run_note = SetDagRunNote.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_dag_run_state(dag_id, dag_run_id, update_dag_run_state):  # noqa: E501
    """Modify a DAG run

    Modify a DAG run.  *New in version 2.2.0*  # noqa: E501

    :param dag_id: The DAG ID.
    :type dag_id: str
    :param dag_run_id: The DAG run ID.
    :type dag_run_id: str
    :param update_dag_run_state: 
    :type update_dag_run_state: dict | bytes

    :rtype: Union[DAGRun, Tuple[DAGRun, int], Tuple[DAGRun, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_dag_run_state = UpdateDagRunState.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
