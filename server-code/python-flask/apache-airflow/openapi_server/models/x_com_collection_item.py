from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class XComCollectionItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dag_id=None, execution_date=None, key=None, task_id=None, timestamp=None):  # noqa: E501
        """XComCollectionItem - a model defined in OpenAPI

        :param dag_id: The dag_id of this XComCollectionItem.  # noqa: E501
        :type dag_id: str
        :param execution_date: The execution_date of this XComCollectionItem.  # noqa: E501
        :type execution_date: str
        :param key: The key of this XComCollectionItem.  # noqa: E501
        :type key: str
        :param task_id: The task_id of this XComCollectionItem.  # noqa: E501
        :type task_id: str
        :param timestamp: The timestamp of this XComCollectionItem.  # noqa: E501
        :type timestamp: str
        """
        self.openapi_types = {
            'dag_id': str,
            'execution_date': str,
            'key': str,
            'task_id': str,
            'timestamp': str
        }

        self.attribute_map = {
            'dag_id': 'dag_id',
            'execution_date': 'execution_date',
            'key': 'key',
            'task_id': 'task_id',
            'timestamp': 'timestamp'
        }

        self._dag_id = dag_id
        self._execution_date = execution_date
        self._key = key
        self._task_id = task_id
        self._timestamp = timestamp

    @classmethod
    def from_dict(cls, dikt) -> 'XComCollectionItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The XComCollectionItem of this XComCollectionItem.  # noqa: E501
        :rtype: XComCollectionItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dag_id(self) -> str:
        """Gets the dag_id of this XComCollectionItem.


        :return: The dag_id of this XComCollectionItem.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id: str):
        """Sets the dag_id of this XComCollectionItem.


        :param dag_id: The dag_id of this XComCollectionItem.
        :type dag_id: str
        """

        self._dag_id = dag_id

    @property
    def execution_date(self) -> str:
        """Gets the execution_date of this XComCollectionItem.


        :return: The execution_date of this XComCollectionItem.
        :rtype: str
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date: str):
        """Sets the execution_date of this XComCollectionItem.


        :param execution_date: The execution_date of this XComCollectionItem.
        :type execution_date: str
        """

        self._execution_date = execution_date

    @property
    def key(self) -> str:
        """Gets the key of this XComCollectionItem.


        :return: The key of this XComCollectionItem.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this XComCollectionItem.


        :param key: The key of this XComCollectionItem.
        :type key: str
        """

        self._key = key

    @property
    def task_id(self) -> str:
        """Gets the task_id of this XComCollectionItem.


        :return: The task_id of this XComCollectionItem.
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id: str):
        """Sets the task_id of this XComCollectionItem.


        :param task_id: The task_id of this XComCollectionItem.
        :type task_id: str
        """

        self._task_id = task_id

    @property
    def timestamp(self) -> str:
        """Gets the timestamp of this XComCollectionItem.


        :return: The timestamp of this XComCollectionItem.
        :rtype: str
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp: str):
        """Sets the timestamp of this XComCollectionItem.


        :param timestamp: The timestamp of this XComCollectionItem.
        :type timestamp: str
        """

        self._timestamp = timestamp
