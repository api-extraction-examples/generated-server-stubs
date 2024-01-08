from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.basic_dag_run import BasicDAGRun
from openapi_server import util

from openapi_server.models.basic_dag_run import BasicDAGRun  # noqa: E501

class DatasetEvent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_dagruns=None, dataset_id=None, dataset_uri=None, extra=None, source_dag_id=None, source_map_index=None, source_run_id=None, source_task_id=None, timestamp=None):  # noqa: E501
        """DatasetEvent - a model defined in OpenAPI

        :param created_dagruns: The created_dagruns of this DatasetEvent.  # noqa: E501
        :type created_dagruns: List[BasicDAGRun]
        :param dataset_id: The dataset_id of this DatasetEvent.  # noqa: E501
        :type dataset_id: int
        :param dataset_uri: The dataset_uri of this DatasetEvent.  # noqa: E501
        :type dataset_uri: str
        :param extra: The extra of this DatasetEvent.  # noqa: E501
        :type extra: object
        :param source_dag_id: The source_dag_id of this DatasetEvent.  # noqa: E501
        :type source_dag_id: str
        :param source_map_index: The source_map_index of this DatasetEvent.  # noqa: E501
        :type source_map_index: int
        :param source_run_id: The source_run_id of this DatasetEvent.  # noqa: E501
        :type source_run_id: str
        :param source_task_id: The source_task_id of this DatasetEvent.  # noqa: E501
        :type source_task_id: str
        :param timestamp: The timestamp of this DatasetEvent.  # noqa: E501
        :type timestamp: str
        """
        self.openapi_types = {
            'created_dagruns': List[BasicDAGRun],
            'dataset_id': int,
            'dataset_uri': str,
            'extra': object,
            'source_dag_id': str,
            'source_map_index': int,
            'source_run_id': str,
            'source_task_id': str,
            'timestamp': str
        }

        self.attribute_map = {
            'created_dagruns': 'created_dagruns',
            'dataset_id': 'dataset_id',
            'dataset_uri': 'dataset_uri',
            'extra': 'extra',
            'source_dag_id': 'source_dag_id',
            'source_map_index': 'source_map_index',
            'source_run_id': 'source_run_id',
            'source_task_id': 'source_task_id',
            'timestamp': 'timestamp'
        }

        self._created_dagruns = created_dagruns
        self._dataset_id = dataset_id
        self._dataset_uri = dataset_uri
        self._extra = extra
        self._source_dag_id = source_dag_id
        self._source_map_index = source_map_index
        self._source_run_id = source_run_id
        self._source_task_id = source_task_id
        self._timestamp = timestamp

    @classmethod
    def from_dict(cls, dikt) -> 'DatasetEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DatasetEvent of this DatasetEvent.  # noqa: E501
        :rtype: DatasetEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_dagruns(self) -> List[BasicDAGRun]:
        """Gets the created_dagruns of this DatasetEvent.


        :return: The created_dagruns of this DatasetEvent.
        :rtype: List[BasicDAGRun]
        """
        return self._created_dagruns

    @created_dagruns.setter
    def created_dagruns(self, created_dagruns: List[BasicDAGRun]):
        """Sets the created_dagruns of this DatasetEvent.


        :param created_dagruns: The created_dagruns of this DatasetEvent.
        :type created_dagruns: List[BasicDAGRun]
        """

        self._created_dagruns = created_dagruns

    @property
    def dataset_id(self) -> int:
        """Gets the dataset_id of this DatasetEvent.

        The dataset id  # noqa: E501

        :return: The dataset_id of this DatasetEvent.
        :rtype: int
        """
        return self._dataset_id

    @dataset_id.setter
    def dataset_id(self, dataset_id: int):
        """Sets the dataset_id of this DatasetEvent.

        The dataset id  # noqa: E501

        :param dataset_id: The dataset_id of this DatasetEvent.
        :type dataset_id: int
        """

        self._dataset_id = dataset_id

    @property
    def dataset_uri(self) -> str:
        """Gets the dataset_uri of this DatasetEvent.

        The URI of the dataset  # noqa: E501

        :return: The dataset_uri of this DatasetEvent.
        :rtype: str
        """
        return self._dataset_uri

    @dataset_uri.setter
    def dataset_uri(self, dataset_uri: str):
        """Sets the dataset_uri of this DatasetEvent.

        The URI of the dataset  # noqa: E501

        :param dataset_uri: The dataset_uri of this DatasetEvent.
        :type dataset_uri: str
        """

        self._dataset_uri = dataset_uri

    @property
    def extra(self) -> object:
        """Gets the extra of this DatasetEvent.

        The dataset event extra  # noqa: E501

        :return: The extra of this DatasetEvent.
        :rtype: object
        """
        return self._extra

    @extra.setter
    def extra(self, extra: object):
        """Sets the extra of this DatasetEvent.

        The dataset event extra  # noqa: E501

        :param extra: The extra of this DatasetEvent.
        :type extra: object
        """

        self._extra = extra

    @property
    def source_dag_id(self) -> str:
        """Gets the source_dag_id of this DatasetEvent.

        The DAG ID that updated the dataset.  # noqa: E501

        :return: The source_dag_id of this DatasetEvent.
        :rtype: str
        """
        return self._source_dag_id

    @source_dag_id.setter
    def source_dag_id(self, source_dag_id: str):
        """Sets the source_dag_id of this DatasetEvent.

        The DAG ID that updated the dataset.  # noqa: E501

        :param source_dag_id: The source_dag_id of this DatasetEvent.
        :type source_dag_id: str
        """

        self._source_dag_id = source_dag_id

    @property
    def source_map_index(self) -> int:
        """Gets the source_map_index of this DatasetEvent.

        The task map index that updated the dataset.  # noqa: E501

        :return: The source_map_index of this DatasetEvent.
        :rtype: int
        """
        return self._source_map_index

    @source_map_index.setter
    def source_map_index(self, source_map_index: int):
        """Sets the source_map_index of this DatasetEvent.

        The task map index that updated the dataset.  # noqa: E501

        :param source_map_index: The source_map_index of this DatasetEvent.
        :type source_map_index: int
        """

        self._source_map_index = source_map_index

    @property
    def source_run_id(self) -> str:
        """Gets the source_run_id of this DatasetEvent.

        The DAG run ID that updated the dataset.  # noqa: E501

        :return: The source_run_id of this DatasetEvent.
        :rtype: str
        """
        return self._source_run_id

    @source_run_id.setter
    def source_run_id(self, source_run_id: str):
        """Sets the source_run_id of this DatasetEvent.

        The DAG run ID that updated the dataset.  # noqa: E501

        :param source_run_id: The source_run_id of this DatasetEvent.
        :type source_run_id: str
        """

        self._source_run_id = source_run_id

    @property
    def source_task_id(self) -> str:
        """Gets the source_task_id of this DatasetEvent.

        The task ID that updated the dataset.  # noqa: E501

        :return: The source_task_id of this DatasetEvent.
        :rtype: str
        """
        return self._source_task_id

    @source_task_id.setter
    def source_task_id(self, source_task_id: str):
        """Sets the source_task_id of this DatasetEvent.

        The task ID that updated the dataset.  # noqa: E501

        :param source_task_id: The source_task_id of this DatasetEvent.
        :type source_task_id: str
        """

        self._source_task_id = source_task_id

    @property
    def timestamp(self) -> str:
        """Gets the timestamp of this DatasetEvent.

        The dataset event creation time  # noqa: E501

        :return: The timestamp of this DatasetEvent.
        :rtype: str
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp: str):
        """Sets the timestamp of this DatasetEvent.

        The dataset event creation time  # noqa: E501

        :param timestamp: The timestamp of this DatasetEvent.
        :type timestamp: str
        """

        self._timestamp = timestamp
