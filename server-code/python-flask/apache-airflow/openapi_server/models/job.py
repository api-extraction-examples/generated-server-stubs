from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Job(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dag_id=None, end_date=None, executor_class=None, hostname=None, id=None, job_type=None, latest_heartbeat=None, start_date=None, state=None, unixname=None):  # noqa: E501
        """Job - a model defined in OpenAPI

        :param dag_id: The dag_id of this Job.  # noqa: E501
        :type dag_id: str
        :param end_date: The end_date of this Job.  # noqa: E501
        :type end_date: str
        :param executor_class: The executor_class of this Job.  # noqa: E501
        :type executor_class: str
        :param hostname: The hostname of this Job.  # noqa: E501
        :type hostname: str
        :param id: The id of this Job.  # noqa: E501
        :type id: int
        :param job_type: The job_type of this Job.  # noqa: E501
        :type job_type: str
        :param latest_heartbeat: The latest_heartbeat of this Job.  # noqa: E501
        :type latest_heartbeat: str
        :param start_date: The start_date of this Job.  # noqa: E501
        :type start_date: str
        :param state: The state of this Job.  # noqa: E501
        :type state: str
        :param unixname: The unixname of this Job.  # noqa: E501
        :type unixname: str
        """
        self.openapi_types = {
            'dag_id': str,
            'end_date': str,
            'executor_class': str,
            'hostname': str,
            'id': int,
            'job_type': str,
            'latest_heartbeat': str,
            'start_date': str,
            'state': str,
            'unixname': str
        }

        self.attribute_map = {
            'dag_id': 'dag_id',
            'end_date': 'end_date',
            'executor_class': 'executor_class',
            'hostname': 'hostname',
            'id': 'id',
            'job_type': 'job_type',
            'latest_heartbeat': 'latest_heartbeat',
            'start_date': 'start_date',
            'state': 'state',
            'unixname': 'unixname'
        }

        self._dag_id = dag_id
        self._end_date = end_date
        self._executor_class = executor_class
        self._hostname = hostname
        self._id = id
        self._job_type = job_type
        self._latest_heartbeat = latest_heartbeat
        self._start_date = start_date
        self._state = state
        self._unixname = unixname

    @classmethod
    def from_dict(cls, dikt) -> 'Job':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Job of this Job.  # noqa: E501
        :rtype: Job
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dag_id(self) -> str:
        """Gets the dag_id of this Job.


        :return: The dag_id of this Job.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id: str):
        """Sets the dag_id of this Job.


        :param dag_id: The dag_id of this Job.
        :type dag_id: str
        """

        self._dag_id = dag_id

    @property
    def end_date(self) -> str:
        """Gets the end_date of this Job.


        :return: The end_date of this Job.
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date: str):
        """Sets the end_date of this Job.


        :param end_date: The end_date of this Job.
        :type end_date: str
        """

        self._end_date = end_date

    @property
    def executor_class(self) -> str:
        """Gets the executor_class of this Job.


        :return: The executor_class of this Job.
        :rtype: str
        """
        return self._executor_class

    @executor_class.setter
    def executor_class(self, executor_class: str):
        """Sets the executor_class of this Job.


        :param executor_class: The executor_class of this Job.
        :type executor_class: str
        """

        self._executor_class = executor_class

    @property
    def hostname(self) -> str:
        """Gets the hostname of this Job.


        :return: The hostname of this Job.
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname: str):
        """Sets the hostname of this Job.


        :param hostname: The hostname of this Job.
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def id(self) -> int:
        """Gets the id of this Job.


        :return: The id of this Job.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Job.


        :param id: The id of this Job.
        :type id: int
        """

        self._id = id

    @property
    def job_type(self) -> str:
        """Gets the job_type of this Job.


        :return: The job_type of this Job.
        :rtype: str
        """
        return self._job_type

    @job_type.setter
    def job_type(self, job_type: str):
        """Sets the job_type of this Job.


        :param job_type: The job_type of this Job.
        :type job_type: str
        """

        self._job_type = job_type

    @property
    def latest_heartbeat(self) -> str:
        """Gets the latest_heartbeat of this Job.


        :return: The latest_heartbeat of this Job.
        :rtype: str
        """
        return self._latest_heartbeat

    @latest_heartbeat.setter
    def latest_heartbeat(self, latest_heartbeat: str):
        """Sets the latest_heartbeat of this Job.


        :param latest_heartbeat: The latest_heartbeat of this Job.
        :type latest_heartbeat: str
        """

        self._latest_heartbeat = latest_heartbeat

    @property
    def start_date(self) -> str:
        """Gets the start_date of this Job.


        :return: The start_date of this Job.
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: str):
        """Sets the start_date of this Job.


        :param start_date: The start_date of this Job.
        :type start_date: str
        """

        self._start_date = start_date

    @property
    def state(self) -> str:
        """Gets the state of this Job.


        :return: The state of this Job.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this Job.


        :param state: The state of this Job.
        :type state: str
        """

        self._state = state

    @property
    def unixname(self) -> str:
        """Gets the unixname of this Job.


        :return: The unixname of this Job.
        :rtype: str
        """
        return self._unixname

    @unixname.setter
    def unixname(self, unixname: str):
        """Sets the unixname of this Job.


        :param unixname: The unixname of this Job.
        :type unixname: str
        """

        self._unixname = unixname
